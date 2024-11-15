package com.ttps.swagger.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateMenuRequest(
        @Size(min = 1, max = 255)
        @NotBlank
        String plate,

        @Size(min = 1, max = 255)
        @NotBlank
        String dessert,

        @Size(min = 1, max = 255)
        @NotBlank
        String beverage
) {
}
