package com.arghya.PantheraSphere.service;

import com.arghya.PantheraSphere.entity.RoleMaster;
import com.arghya.PantheraSphere.repository.RoleRepository;
import com.arghya.PantheraSphere.repository.projection.RoleMasterRoleNameProjection;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<String> getRoles() {
        return roleRepository.findAllBy()
                .stream()
                .map(RoleMasterRoleNameProjection::getRoleName)
                .collect(Collectors.toList());
    }

    public RoleMaster addRole(String roleName) {
        RoleMaster role = new RoleMaster();
        role.setRoleName(roleName);
        roleRepository.save(role);
        return role;
    }

    public List<RoleMaster> getRoleInfo() {
        return roleRepository.findAll(Sort.by("roleID").ascending());
    }
}
