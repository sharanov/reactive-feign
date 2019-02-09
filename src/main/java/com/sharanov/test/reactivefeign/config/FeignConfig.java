package com.sharanov.test.reactivefeign.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Logger;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.form.FormEncoder;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactivefeign.spring.config.EnableReactiveFeignClients;

@Configuration
@EnableReactiveFeignClients(basePackages = "org.sharanov.test.reactivefeign")
public class FeignConfig {
    private static final ObjectMapper OBJECT_MAPPER = CustomObjectMapper.create();

    @Bean
    public Encoder feignEncoder() {
        return new FormEncoder(new JacksonEncoder(OBJECT_MAPPER));
    }

    @Bean
    public Decoder decoder() {
        return new JacksonDecoder(OBJECT_MAPPER);
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}