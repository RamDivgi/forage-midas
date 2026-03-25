package com.jpmc.midascore.controller;

import com.jpmc.midascore.entity.Incentive;
import com.jpmc.midascore.foundation.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IncentiveController {

    @PostMapping("/incentive")
    public ResponseEntity<Incentive> calculateIncentive(@RequestBody Transaction transaction) {
        // Simple incentive calculation, e.g., 10% of transaction amount
        float incentiveAmount = transaction.getAmount() * 0.1f;
        Incentive incentive = new Incentive(incentiveAmount);
        return ResponseEntity.ok(incentive);
    }
}