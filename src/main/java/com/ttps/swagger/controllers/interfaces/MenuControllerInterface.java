package com.ttps.swagger.controllers.interfaces;

import com.ttps.swagger.dtos.CreateMenuRequest;
import com.ttps.swagger.dtos.MenuDTO;
import com.ttps.swagger.dtos.UpdateMenuRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@Tag(name = "Menu Controller", description = "CRUD Endpoints for menu")
@SecurityRequirement(name = "Autenticacion TTPS")
public interface MenuControllerInterface {

    @PostMapping
    @Operation(summary = "Create a Menu", description = "Creates a new menu with the provided values")
    @ApiResponse(responseCode = "200", description = "Menu Created", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, examples = @ExampleObject(value = "{\"uuid\": \"ed69f005-cb85-4e7b-aea7-b075b59fae09\",\"plate\": \"Hamburguesa\",\"dessert\": \"Helado\",\"beverage\": \"Coca\"}")))
    ResponseEntity<MenuDTO> createMenu(
            @RequestBody(description = "The information of the menu to be created", content = @Content(schema = @Schema(implementation = CreateMenuRequest.class), examples = @ExampleObject(value = "{\"plate\": \"Hamburguesa\",\"dessert\": \"Helado\",\"beverage\": \"Coca\"}")))
            CreateMenuRequest user);

    @PutMapping
    @Operation(summary = "Update a Menu", description = "Updates a menu with the corresponding uuid and the provided values")
    @ApiResponse(responseCode = "200", description = "Menu Updated", content = @Content(mediaType = MediaType.APPLICATION_JSON_VALUE, examples = @ExampleObject(value = "{\"uuid\": \"ed69f005-cb85-4e7b-aea7-b075b59fae09\",\"plate\": \"Hamburguesa\",\"dessert\": \"Helado\",\"beverage\": \"Pepsi\"}")))

    ResponseEntity<MenuDTO> updateMenu(
            @RequestBody(description = "The information of the menu to be updated", content = @Content(schema = @Schema(implementation = CreateMenuRequest.class), examples = @ExampleObject(value = "{\"plate\": \"Hamburguesa\",\"dessert\": \"Helado\",\"beverage\": \"Pepsi\"}")))
            UpdateMenuRequest user);


    @DeleteMapping
    @Operation(summary = "Deletes a Menu", description = "Deletes a menu with the corresponding uuid")

    void deleteMenu(@Parameter(description = "The uuid of the menu to be deleted", example = "ed69f005-cb85-4e7b-aea7-b075b59fae09")
                    String uuid);

}
