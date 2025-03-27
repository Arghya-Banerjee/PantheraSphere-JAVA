package com.arghya.PantheraSphere.repository;

import com.arghya.PantheraSphere.dto.GetChecklistDto;
import com.arghya.PantheraSphere.entity.RootEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Repository
public interface ChecklistRepository extends JpaRepository<RootEntity, Long> {

    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode", nativeQuery = true)
    List<GetChecklistDto> getAllChecklist(
            @Param("OpMode") int OpMode
    );

    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @ChecklistID = :ChecklistID", nativeQuery = true)
    GetChecklistDto getChecklistById(
            @Param("OpMode") int OpMode,
            @Param("ChecklistID") Long ChecklistID
    );

    @Modifying
    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @ChecklistID = :ChecklistID, @Verified = :Verified", nativeQuery = true)
    void verifyChecklist(
            @Param("OpMode") int OpMode,
            @Param("ChecklistID") Long ChecklistID,
            @Param("Verified") int Verified
    );

    @Modifying
    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @ChecklistID = :ChecklistID", nativeQuery = true)
    void deleteChecklist(
            @Param("OpMode") int OpMode,
            @Param("ChecklistID") Long ChecklistID
    );

    @Modifying
    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @ForestID = :ForestID, @CreatedBy = :CreatedBy, @SafariDate = :SafariDate, @StartTime = :StartTime, @GuideID = :GuideID, @DriverID = :DriverID", nativeQuery = true)
    void addChecklist(
            @Param("OpMode") int OpMode,
            @Param("ForestID") Long ForestID,
            @Param("CreatedBy") Long CreatedBy,
            @Param("SafariDate") Date SafariDate,
            @Param("StartTime") Time StartTime,
            @Param("GuideID") Long GuideID,
            @Param("DriverID") Long DriverID
    );

    @Modifying
    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @ChecklistID = :ChecklistID, @ForestID = :ForestID, @CreatedBy = :CreatedBy, @SafariDate = :SafariDate, @StartTime = :StartTime, @GuideID = :GuideID, @DriverID = :DriverID", nativeQuery = true)
    void updateChecklist(
            @Param("OpMode") int OpMode,
            @Param("ChecklistID") Long ChecklistID,
            @Param("ForestID") Long ForestID,
            @Param("CreatedBy") Long CreatedBy,
            @Param("SafariDate") Date SafariDate,
            @Param("StartTime") Time StartTime,
            @Param("GuideID") Long GuideID,
            @Param("DriverID") Long DriverID
    );

    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @ForestID = :ForestID", nativeQuery = true)
    List<GetChecklistDto> getChecklistByForestId(
            @Param("OpMode") int OpMode,
            @Param("ForestID") Long ForestID
    );

    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @NDays = :NDays", nativeQuery = true)
    List<GetChecklistDto> getChecklistByLastNDays(
            @Param("OpMode") int OpMode,
            @Param("NDays") int NDays
    );

    @Query(value = "EXEC dbo.usp_Checklist @OpMode = :OpMode, @Verified = :Verified", nativeQuery = true)
    List<GetChecklistDto> getChecklistByVerificationStatus(
            @Param("OpMode") int OpMode,
            @Param("Verified") int Verified
    );
}
