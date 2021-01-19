package com.app.simpe.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class}, scanBasePackages = "com.app.simpe.kafka")
public class KafkaProducerMain {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerMain.class, args);
    }
}
