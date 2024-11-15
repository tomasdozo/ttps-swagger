package com.ttps.swagger.dtos;

public record UpdateMenuRequest(
        String uuid,
        String plate,
        String dessert,
        String beverage
) {
}
