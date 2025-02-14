package com.arghya.PantheraSphere.controller;

import com.arghya.PantheraSphere.dto.AddChecklistDto;
import com.arghya.PantheraSphere.dto.GetChecklistByUserDto;
import com.arghya.PantheraSphere.dto.GetChecklistDto;
import com.arghya.PantheraSphere.service.ChecklistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checklist")
public class ChecklistController {

    @Autowired
    private ChecklistService checklistService;

    @GetMapping("/all")
    public ResponseEntity<List<GetChecklistDto>> getSightings() {
        List<GetChecklistDto> checklists = checklistService.getAllSightings(1);
        return ResponseEntity.ok(checklists);
    }

    @GetMapping("/{checklistid}")
    public ResponseEntity<GetChecklistDto> getChecklistById(@PathVariable Long checklistid){
        GetChecklistDto checklist = checklistService.getChecklistById(2, checklistid);
        return ResponseEntity.ok(checklist);
    }

    @GetMapping("/user/{user}")
    public ResponseEntity<List<GetChecklistByUserDto>> getChecklistsByUser(@PathVariable Long user){
        List<GetChecklistByUserDto> checklist = checklistService.getSightingsByUser(3, user);
        return ResponseEntity.ok(checklist);
    }

    @PutMapping("/{checklistid}/verify/{verification}")
    public void getVerification(@PathVariable Long checklistid, @PathVariable int verification){
        checklistService.getVerification(4, checklistid, verification);
    }

    @DeleteMapping("/{checklistid}")
    public void deleteVerification(@PathVariable Long checklistid){
        checklistService.deleteChecklist(5, checklistid);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addChecklist(@RequestBody AddChecklistDto addChecklistDto) {
        checklistService.addChecklist(6,
                addChecklistDto.getForestID(),
                addChecklistDto.getCreatedBy(),
                addChecklistDto.getSafariDate(),
                addChecklistDto.getStartTime(),
                addChecklistDto.getGuideID(),
                addChecklistDto.getDriverID()
        );
        return ResponseEntity.ok("Checklist Added Successfully !!");
    }

    @PutMapping("/{checklistid}")
    public ResponseEntity<String> updateChecklist(@PathVariable Long checklistid, @RequestBody AddChecklistDto addChecklistDto){
        checklistService.updateChecklist(7,
                checklistid,
                addChecklistDto.getForestID(),
                addChecklistDto.getCreatedBy(),
                addChecklistDto.getSafariDate(),
                addChecklistDto.getStartTime(),
                addChecklistDto.getGuideID(),
                addChecklistDto.getDriverID()
        );
        return ResponseEntity.ok("Checklist Updated Successfully !!");
    }
}
