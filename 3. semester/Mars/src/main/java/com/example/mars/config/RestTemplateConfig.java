package com.example.mars.config;

import com.zaxxer.hikari.HikariConfig;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        System.out.println("builder en rest");
        return builder.build();
    }

    @Bean
    public void setHikari() {
        System.out.println("setting hikari xxxxxxxxxxxxxxxxxx");
        HikariConfig config = new HikariConfig();
        config.setMaximumPoolSize(20);
        config.setConnectionTimeout(300000);
        config.setConnectionTimeout(120000);
        config.setLeakDetectionThreshold(300000);
    }

}
