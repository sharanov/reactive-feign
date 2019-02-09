package com.sharanov.test.reactivefeign.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private String customerId;
    private String email;
    private String name;
    private String companyName;
}
