package com.ttps.swagger.controllers;


import com.ttps.swagger.controllers.interfaces.MenuControllerInterface;
import com.ttps.swagger.dtos.CreateMenuRequest;
import com.ttps.swagger.dtos.UpdateMenuRequest;
import com.ttps.swagger.dtos.MenuDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/menus")
public class MenuController implements MenuControllerInterface {

    @Override
    @PostMapping
    public ResponseEntity<MenuDTO> createMenu( @RequestBody CreateMenuRequest Menu) {
        MenuDTO MenuDTO = new MenuDTO(UUID.randomUUID().toString(), Menu.plate(), Menu.dessert(), Menu.beverage());

        //Here we would persist the Menu

        return ResponseEntity.ok(MenuDTO);
    }

    @Override
    @PutMapping
    public ResponseEntity<MenuDTO> updateMenu(UpdateMenuRequest Menu) {
        MenuDTO MenuDTO = new MenuDTO(Menu.uuid(), Menu.plate(), Menu.dessert(), Menu.beverage());

        //Here we would persist the Menu

        return ResponseEntity.ok(MenuDTO);
    }

    @Override
    @DeleteMapping("/{uuid}")
    public void deleteMenu(@PathVariable String uuid) {

        //Here we would delete the Menu
        
    }
}
