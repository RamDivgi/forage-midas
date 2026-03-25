
package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaTransactionListener {

    private static final Logger logger = LoggerFactory.getLogger(KafkaTransactionListener.class);

    @Autowired
    private DatabaseConduit databaseConduit;

    @KafkaListener(topics = "${general.kafka-topic}", groupId = "midas-consumer")
    public void listen(Transaction transaction) {
        logger.info("Received transaction: " + transaction);
        databaseConduit.process(transaction);
    }
}

