package com.arghya.PantheraSphere.service;

import com.arghya.PantheraSphere.dto.ChecklistContributionsDto;
import com.arghya.PantheraSphere.dto.ChecklistSummaryDto;
import com.arghya.PantheraSphere.dto.GetChecklistByUserDto;
import com.arghya.PantheraSphere.dto.GetChecklistDto;
import com.arghya.PantheraSphere.repository.ChecklistRepository;
import jakarta.transaction.Transactional;
import org.hibernate.annotations.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Service
@Transactional
public class ChecklistService {

    @Autowired
    private ChecklistRepository checklistRepository;

    public List<GetChecklistDto> getAllSightings(int OpMode){
        return checklistRepository.getAllChecklist(OpMode);
    }

    public GetChecklistDto getChecklistById(int OpMode, Long ChecklistID){
        return checklistRepository.getChecklistById(OpMode, ChecklistID);
    }

    public List<GetChecklistByUserDto> getSightingsByUser(int OpMode, Long CreatedBy){
        return checklistRepository.getChecklistByUser(OpMode, CreatedBy);
    }

    public void getVerification(int OpMode, Long ChecklistID, int Verified){
        checklistRepository.getVerification(OpMode, ChecklistID, Verified);
    }

    public void deleteChecklist(int OpMode, Long ChecklistID){
        checklistRepository.deleteChecklist(OpMode, ChecklistID);
    }

    public void addChecklist(int OpMode, Long ForestID, Long CreatedBy, Date SafariDate, Time StartTime, Long GuideID, Long DriverID){
        checklistRepository.addChecklist(OpMode, ForestID, CreatedBy, SafariDate, StartTime, GuideID, DriverID);
    }

    public void updateChecklist(int OpMode, Long ChecklistID, Long ForestID, Long CreatedBy, Date SafariDate, Time StartTime, Long GuideID, Long DriverID){
        checklistRepository.updateChecklist(OpMode, ChecklistID, ForestID, CreatedBy, SafariDate, StartTime, GuideID, DriverID);
    }

    public List<GetChecklistDto> getChecklistByForestId(int OpMode, Long ForestID){
        return checklistRepository.getChecklistByForestId(OpMode, ForestID);
    }

    public List<GetChecklistDto> getChecklistByLastNDays(int OpMode, int NDays){
        return checklistRepository.getChecklistByLastNDays(OpMode, NDays);
    }

    public List<GetChecklistDto> getChecklistByVerificationStatus(int OpMode, int Verified){
        return checklistRepository.getChecklistByVerificationStatus(OpMode, Verified);
    }

    public List<ChecklistContributionsDto> getChecklistTopContributions(int OpMode, int NTop){
        return checklistRepository.getChecklistTopContributions(OpMode, NTop);
    }

    public ChecklistSummaryDto getChecklistSummary(int OpMode){
        return checklistRepository.getChecklistSummary(OpMode);
    }
}
