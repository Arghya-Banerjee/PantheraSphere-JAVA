package com.arghya.PantheraSphere.controller;

import com.arghya.PantheraSphere.dto.*;
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

    @GetMapping("/forest/{forestid}")
    public ResponseEntity<List<GetChecklistDto>> getChecklistByForestId(@PathVariable Long forestid){
        List<GetChecklistDto> checklists = checklistService.getChecklistByForestId(8, forestid);
        return ResponseEntity.ok(checklists);
    }

    @GetMapping("/recent/{ndays}")
    public ResponseEntity<List<GetChecklistDto>> getChecklistByLastNDays(@PathVariable int ndays){
        List<GetChecklistDto> checklists = checklistService.getChecklistByLastNDays(9, ndays);
        return ResponseEntity.ok(checklists);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<GetChecklistDto>> getChecklistByVerificationStatus(@PathVariable int status){
        List<GetChecklistDto> checklists = checklistService.getChecklistByVerificationStatus(10, status);
        return ResponseEntity.ok(checklists);
    }

    @GetMapping("/top-contributors/{ntop}")
    public ResponseEntity<List<ChecklistContributionsDto>> getChecklistNTopContributions(@PathVariable int ntop){
        List<ChecklistContributionsDto> contributors = checklistService.getChecklistTopContributions(11, ntop);
        return ResponseEntity.ok(contributors);
    }

    @GetMapping("/top-contributors")
    public ResponseEntity<List<ChecklistContributionsDto>> getChecklistTopContributions(){
        List<ChecklistContributionsDto> contributors = checklistService.getChecklistTopContributions(11, 5);
        return ResponseEntity.ok(contributors);
    }

    @GetMapping("/summary")
    public ResponseEntity<ChecklistSummaryDto> getChecklistSummary(){
        ChecklistSummaryDto summary = checklistService.getChecklistSummary(12);
        return ResponseEntity.ok(summary);
    }
}
