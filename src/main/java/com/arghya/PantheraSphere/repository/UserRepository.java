package com.arghya.PantheraSphere.repository;

import com.arghya.PantheraSphere.dto.ChecklistContributionsDto;
import com.arghya.PantheraSphere.dto.ChecklistSummaryDto;
import com.arghya.PantheraSphere.dto.GetChecklistByUserDto;
import com.arghya.PantheraSphere.model.RootEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<RootEntity, Long> {

    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @CreatedBy = :CreatedBy", nativeQuery = true)
    List<GetChecklistByUserDto> getChecklistsByUser(@Param("OpMode") int OpMode, @Param("CreatedBy") Long CreatedBy);

    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @CreatedBy = :CreatedBy", nativeQuery = true)
    ChecklistContributionsDto getUserSummary(@Param("OpMode") int OpMode, @Param("CreatedBy") Long CreatedBy);

    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @NTop = :NTop", nativeQuery = true)
    List<ChecklistContributionsDto> getChecklistTopContributions(@Param("OpMode") int OpMode, @Param("NTop") int NTop);

    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode", nativeQuery = true)
    ChecklistSummaryDto getChecklistSummary(@Param("OpMode") int OpMode);
}
