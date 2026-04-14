# Midas Core

Backend Financial Transaction Processing System – JPMorgan Chase Forage Simulation

## Overview

Midas Core is a backend financial transaction processing system built as part of the JPMorgan Chase Advanced Software Engineering Virtual Experience Program on Forage.

The project simulates an enterprise-level banking backend where transaction events are consumed through Apache Kafka, validated against account data, and persisted into an in-memory database using Spring Boot and JPA.

It demonstrates how modern financial systems process transactions securely through event-driven architecture.

## Key Features

* Kafka-based transaction event listener
* Real-time transaction validation
* Sender and recipient account verification
* Balance update logic for both accounts
* Transaction persistence using JPA entities
* H2 in-memory database integration
* Maven-based test execution

## Technology Stack

* Java 17
* Spring Boot
* Apache Kafka
* Spring Data JPA
* H2 Database
* Maven

## System Workflow

1. Transaction messages are received through Kafka topics.
2. Incoming payloads are deserialized into Java transaction objects.
3. Sender and recipient accounts are validated from the database.
4. Sender balance is checked before processing.
5. Valid transactions update sender and recipient balances.
6. Transaction records are stored in the database.

## Transaction Validation Rules

A transaction is processed only when:

* Sender account exists
* Recipient account exists
* Sender has sufficient balance

If validation fails, the transaction is rejected and no database changes are made.

## Project Structure

* `component` → Kafka listener, processing logic, transaction service
* `entity` → User entity and transaction entity definitions
* `repository` → Spring Data JPA repositories
* `foundation` → Core transaction model classes

## Learning Outcomes

This project demonstrates practical backend engineering concepts including:

* Event-driven system design
* Message queue integration
* Transaction validation
* Database persistence
* Backend service architecture used in financial platforms

## Program Context

Developed as part of the JPMorgan Chase Advanced Software Engineering Virtual Experience Program on Forage.

## Repository Purpose

This repository represents a simulation of enterprise backend transaction handling and showcases backend development practices relevant to financial software engineering.
