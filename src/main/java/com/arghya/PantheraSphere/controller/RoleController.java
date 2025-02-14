package com.arghya.PantheraSphere.controller;

import com.arghya.PantheraSphere.dto.RoleDto;
import com.arghya.PantheraSphere.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/all")
    public ResponseEntity<List<RoleDto>> getRoles(){
        List<RoleDto> roles = roleService.getRoles();
        return ResponseEntity.ok(roles);
    }

}
