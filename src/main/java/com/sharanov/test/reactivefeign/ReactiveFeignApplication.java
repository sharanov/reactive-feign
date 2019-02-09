package com.sharanov.test.reactivefeign;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication(scanBasePackages = {"com.sharanov.test.reactivefeign"})
@EnableWebFlux
public class ReactiveFeignApplication {
        public static void main(String[] args) {
            SpringApplication.run(ReactiveFeignApplication.class, args);
        }
}
