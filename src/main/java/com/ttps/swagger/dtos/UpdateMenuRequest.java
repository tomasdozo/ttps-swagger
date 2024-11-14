package com.ttps.swagger.dtos;

public record UpdateMenuRequest(
        String uuid,
        String name,
        String lastName,
        String address
) {
}
