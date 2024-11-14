package com.ttps.swagger.controllers;


import com.ttps.swagger.controllers.interfaces.UserControllerInterface;
import com.ttps.swagger.dtos.CreateUserRequest;
import com.ttps.swagger.dtos.UpdateUserRequest;
import com.ttps.swagger.dtos.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class UserController implements UserControllerInterface {

    @Override
    public ResponseEntity<UserDTO> createUser(CreateUserRequest user) {
        UserDTO userDTO = new UserDTO(UUID.randomUUID().toString(), user.name(), user.lastName(), user.address());

        //Here we would persist the user

        return ResponseEntity.ok(userDTO);
    }

    @Override
    public ResponseEntity<UserDTO> updateUser(UpdateUserRequest user) {
        UserDTO userDTO = new UserDTO(user.uuid(), user.name(), user.lastName(), user.address());

        //Here we would persist the user

        return ResponseEntity.ok(userDTO);
    }

    @Override
    public void deleteUser(String uuid) {

        //Here we would delete the user

    }
}
