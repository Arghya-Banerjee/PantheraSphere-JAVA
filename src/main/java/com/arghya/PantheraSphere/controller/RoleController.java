package com.arghya.PantheraSphere.controller;

import com.arghya.PantheraSphere.entity.RoleMaster;
import com.arghya.PantheraSphere.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/admin/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/names")
    public ResponseEntity<List<String>> getRoles(){
        List<String> roles = roleService.getRoles();
        return ResponseEntity.ok(roles);
    }

    @GetMapping("/")
    public ResponseEntity<List<RoleMaster>> getRoleInfo() {
        List<RoleMaster> roleInfo = roleService.getRoleInfo();
        return ResponseEntity.ok(roleInfo);
    }

    @PostMapping("/add")
    public ResponseEntity<RoleMaster> addRole(@RequestParam String roleName) {
        RoleMaster role = roleService.addRole(roleName);
        return ResponseEntity.ok(role);
    }

}
