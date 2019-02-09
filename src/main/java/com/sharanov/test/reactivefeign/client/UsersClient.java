package com.sharanov.test.reactivefeign.client;

import com.sharanov.test.reactivefeign.config.FeignConfig;
import feign.Headers;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import reactivefeign.spring.config.ReactiveFeignClient;
import reactor.core.publisher.Mono;

@ReactiveFeignClient(url = "${url.users}", configuration = FeignConfig.class)
@Headers({ "Accept: application/json" })
public interface UsersClient {
    @GetMapping(value = "/users/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Mono<UserDto> getUser(@PathVariable("id") String id);
}
