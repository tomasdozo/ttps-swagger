package com.ttps.swagger.dtos;

public record UpdateUserRequest(
        String uuid,
        String name,
        String lastName,
        String address
) {
}
