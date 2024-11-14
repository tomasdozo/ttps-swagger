package com.ttps.swagger.controllers;


import com.ttps.swagger.controllers.interfaces.MenuControllerInterface;
import com.ttps.swagger.dtos.CreateMenuRequest;
import com.ttps.swagger.dtos.UpdateMenuRequest;
import com.ttps.swagger.dtos.MenuDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MenuController implements MenuControllerInterface {

    @Override
    public ResponseEntity<MenuDTO> createMenu(CreateMenuRequest Menu) {
        MenuDTO MenuDTO = new MenuDTO(UUID.randomUUID().toString(), Menu.name(), Menu.lastName(), Menu.address());

        //Here we would persist the Menu

        return ResponseEntity.ok(MenuDTO);
    }

    @Override
    public ResponseEntity<MenuDTO> updateMenu(UpdateMenuRequest Menu) {
        MenuDTO MenuDTO = new MenuDTO(Menu.uuid(), Menu.name(), Menu.lastName(), Menu.address());

        //Here we would persist the Menu

        return ResponseEntity.ok(MenuDTO);
    }

    @Override
    public void deleteMenu(String uuid) {

        //Here we would delete the Menu
        
    }
}
