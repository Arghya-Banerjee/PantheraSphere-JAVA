package com.arghya.PantheraSphere.service;

import com.arghya.PantheraSphere.dto.GetChecklistByUserDto;
import com.arghya.PantheraSphere.dto.GetChecklistDto;
import com.arghya.PantheraSphere.repository.ChecklistRepository;
import jakarta.transaction.Transactional;
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
}
