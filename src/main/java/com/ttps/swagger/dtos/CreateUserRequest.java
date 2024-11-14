package com.ttps.swagger.dtos;

public record CreateUserRequest(
        String name,
        String lastName,
        String address
) {
}
