package com.ttps.swagger.controllers.interfaces;

import com.ttps.swagger.dtos.*;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/menus")
@Tag(name = "Menu Controller", description = "Endpoints for menu CRUD")
@SecurityScheme(name = "Autenticación Basic" , type = SecuritySchemeType.HTTP, scheme = "Basic" )
public interface MenuControllerInterface {

    @PostMapping
    ResponseEntity<MenuDTO> createMenu(@RequestBody CreateMenuRequest user);

    @PutMapping
    ResponseEntity<MenuDTO> updateMenu(@RequestBody UpdateMenuRequest user);

    @DeleteMapping("/{uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteMenu(@PathVariable String uuid);

}
