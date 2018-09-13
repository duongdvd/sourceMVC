package com.hachinet.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource("classpath:config.properties")
public class ClientConfig {
    @Value("${fixFood.notification.config}")
    private Integer notification;
}
