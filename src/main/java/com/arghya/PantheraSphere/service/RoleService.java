package com.arghya.PantheraSphere.service;

import com.arghya.PantheraSphere.dto.RoleDto;
import com.arghya.PantheraSphere.repository.RoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<RoleDto> getRoles() {
        return roleRepository.getAllRoles(1);
    }
}
