package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
public class HDPMongoConfig {

    public static final String MONGO_TEMPLATE = "hdpMongoTemplate";
}
