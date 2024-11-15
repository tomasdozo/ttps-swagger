package com.ttps.swagger.controllers;


import com.ttps.swagger.dtos.CreateUserRequest;
import com.ttps.swagger.dtos.UpdateUserRequest;
import com.ttps.swagger.dtos.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody CreateUserRequest user) {
        UserDTO userDTO = new UserDTO(UUID.randomUUID().toString(), user.name(), user.lastName(), user.address());

        //Here we would persist the user

        return ResponseEntity.ok(userDTO);
    }

    @PutMapping
    public ResponseEntity<UserDTO> updateUser(@RequestBody UpdateUserRequest user) {
        UserDTO userDTO = new UserDTO(user.uuid(), user.name(), user.lastName(), user.address());

        //Here we would persist the user

        return ResponseEntity.ok(userDTO);
    }

    @DeleteMapping("/{uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable String uuid) {

        //Here we would delete the user

    }
}
