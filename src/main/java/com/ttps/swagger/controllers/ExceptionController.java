package com.ttps.swagger.controllers;

import com.ttps.swagger.dtos.ExceptionResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ApiResponse(responseCode = "400", description = "An exception was thrown during the execution", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, examples = @ExampleObject("{\"status\": \"400\",\"message\": \"Null pointer exception\"}")))
    public ResponseEntity<ExceptionResponse> handleException(Exception e) {
        return ResponseEntity.badRequest().body(new ExceptionResponse("400", e.getMessage()));
    }
}
