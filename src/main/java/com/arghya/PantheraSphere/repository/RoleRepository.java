package com.arghya.PantheraSphere.repository;

import com.arghya.PantheraSphere.entity.RoleMaster;
import com.arghya.PantheraSphere.repository.projection.RoleMasterRoleNameProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<RoleMaster, Long> {

    List<RoleMasterRoleNameProjection> findAllBy();

}
