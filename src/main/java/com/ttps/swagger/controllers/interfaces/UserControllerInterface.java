package com.ttps.swagger.controllers.interfaces;

import com.ttps.swagger.dtos.CreateUserRequest;
import com.ttps.swagger.dtos.UpdateUserRequest;
import com.ttps.swagger.dtos.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
public interface UserControllerInterface {

    @PostMapping
    ResponseEntity<UserDTO> createUser(@RequestBody CreateUserRequest user);

    @PutMapping
    ResponseEntity<UserDTO> updateUser(@RequestBody UpdateUserRequest user);

    @DeleteMapping("/{uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void deleteUser(@PathVariable String uuid);

}
