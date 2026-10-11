package com.chethiya.concurrency_lab.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;
@Configuration
public class DatabaseSchemaInitializer {
    @Bean
    ApplicationRunner createDatabaseSchema(DataSource dataSource) {
        return args -> {
            try (Connection connection = dataSource.getConnection();
                 Statement statement = connection.createStatement()) {

                statement.execute(
                        "CREATE SCHEMA IF NOT EXISTS orderflow"
                );
            }
        };
    }
}
