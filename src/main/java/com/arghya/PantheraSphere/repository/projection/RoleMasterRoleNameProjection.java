package com.arghya.PantheraSphere.repository.projection;

import com.arghya.PantheraSphere.entity.RoleMaster;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface RoleMasterRoleNameProjection {
    List<RoleMaster> findAll(Sort sort);
    String getRoleName();
}
