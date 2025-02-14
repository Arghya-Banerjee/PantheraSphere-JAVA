package com.arghya.PantheraSphere.repository;

import com.arghya.PantheraSphere.dto.RoleDto;
import com.arghya.PantheraSphere.model.RootEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<RootEntity, Long> {

    @Query(value = "EXEC dbo.usp_Role @OpMode = :OpMode", nativeQuery = true)
    List<RoleDto> getAllRoles(@Param("OpMode") int OpMode);

}
