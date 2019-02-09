package com.sharanov.test.reactivefeign.controller;

import com.sharanov.test.reactivefeign.client.UserDto;
import com.sharanov.test.reactivefeign.client.UsersClient;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class TestController {

    private final UsersClient client;

    public TestController(UsersClient client) {
        this.client = client;
    }

    @GetMapping("/just")
    public Mono<Dto> getJust() {
        return Mono.just(new Dto("id", "name"));
    }

    @GetMapping("/user/{id}")
    public Mono<UserDto> getUser(@PathVariable("id") String id) {
        return client.getUser(id);
    }

    @Data
    @AllArgsConstructor
    private static class Dto {
        private String id;
        private String name;
    }
}
