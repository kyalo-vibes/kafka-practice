 Kafka Project README
====================
### Overview

This project is a Kafka application built using Spring Boot and Apache Kafka. It provides a basic configuration for producing and consuming messages using Kafka.

### Configuration

The project uses the following configuration:

* Kafka bootstrap servers: `localhost:9092`
* Group ID: `myGroup`
* Auto offset reset: `earliest`
* Key deserializer: `org.apache.kafka.common.serialization.StringDeserializer`
* Value deserializer: `org.springframework.kafka.support.serializer.JsonDeserializer`
* Key serializer: `org.apache.kafka.common.serialization.StringSerializer`
* Value serializer: `org.springframework.kafka.support.serializer.JsonSerializer`

### Dependencies

The project uses the following dependencies:

* `spring-boot-starter-web`
* `spring-kafka`
* `lombok`
* `spring-boot-starter-test`
* `spring-kafka-test`

### Components

The project consists of the following components:

* **MessageController**: Handles incoming messages and sends them to Kafka topics.
* **KafkaProducer**: Produces messages to Kafka topics.
* **KafkaJsonProducer**: Produces JSON messages to Kafka topics.
* **KafkaConsumer**: Consumes messages from Kafka topics.
* **KafkaJsonConsumer**: Consumes JSON messages from Kafka topics.
* **Student**: A Java class representing a student, used as a payload for JSON messages.

### Building and Running

To build and run the project, use the following commands:

* `mvn clean package`
* `mvn spring-boot:run`

### Notes

This project is a basic example of a Kafka application using Spring Boot. It provides a starting point for building more complex Kafka applications.
