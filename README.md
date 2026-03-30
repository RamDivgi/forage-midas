# Midas
Project repo for the JPMC Advanced Software Engineering Forage program

Midas Core – JPMC Forage Backend Simulation

Overview

Midas Core is a backend financial transaction processing system developed as part of the JPMorgan Chase Forage virtual experience program.

The project simulates a real-world banking backend where financial transactions are received through Kafka, validated against account data, and persisted into a database using Spring Boot and JPA.

Features

- Kafka-based transaction listener
- Transaction validation logic
- H2 in-memory database integration
- Sender and recipient balance updates
- Transaction persistence using JPA entities
- Automated test-driven development using Maven

Technologies Used

- Java 17
- Spring Boot
- Apache Kafka
- Spring Data JPA
- H2 Database
- Maven

Project Workflow

1. Incoming transaction messages are received through Kafka.
2. Transactions are deserialized into Java objects.
3. Sender and recipient accounts are validated.
4. Valid transactions update balances.
5. Transaction records are stored in the database.

Validation Rules

A transaction is accepted only if:

- Sender exists
- Recipient exists
- Sender has sufficient balance

Invalid transactions are discarded without database changes.

Project Structure

- "component" → Kafka listener and database logic
- "entity" → User and transaction database entities
- "repository" → JPA repositories
- "foundation" → Transaction model classes

Learning Outcome

This project demonstrates event-driven backend architecture, message queue integration, transactional validation, and database persistence used in enterprise financial systems.

Program

Developed as part of JPMorgan Chase Software Engineering Virtual Experience on Forage.