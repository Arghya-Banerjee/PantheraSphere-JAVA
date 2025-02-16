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
    public ResponseEntity<List<GetChecklistDto>> getChecklists() {
        List<GetChecklistDto> checklists = checklistService.getAllChecklists(1);
        return ResponseEntity.ok(checklists);
    }

    @GetMapping("/{checklistid}")
    public ResponseEntity<GetChecklistDto> getChecklistById(@PathVariable Long checklistid) {
        GetChecklistDto checklist = checklistService.getChecklistById(2, checklistid);
        return ResponseEntity.ok(checklist);
    }

    @PutMapping("/{checklistid}/verify/{verification}")
    public void verifyChecklist(@PathVariable Long checklistid, @PathVariable int verification) {
        checklistService.verifyChecklist(4, checklistid, verification);
    }

    @DeleteMapping("/{checklistid}")
    public void deleteChecklist(@PathVariable Long checklistid) {
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
        return ResponseEntity.ok("Checklist Added Successfully!");
    }

    @PutMapping("/{checklistid}")
    public ResponseEntity<String> updateChecklist(@PathVariable Long checklistid, @RequestBody AddChecklistDto addChecklistDto) {
        checklistService.updateChecklist(7,
                checklistid,
                addChecklistDto.getForestID(),
                addChecklistDto.getCreatedBy(),
                addChecklistDto.getSafariDate(),
                addChecklistDto.getStartTime(),
                addChecklistDto.getGuideID(),
                addChecklistDto.getDriverID()
        );
        return ResponseEntity.ok("Checklist Updated Successfully!");
    }

    @GetMapping("/forest/{forestid}")
    public ResponseEntity<List<GetChecklistDto>> getChecklistByForestId(@PathVariable Long forestid) {
        List<GetChecklistDto> checklists = checklistService.getChecklistByForestId(8, forestid);
        return ResponseEntity.ok(checklists);
    }

    @GetMapping("/recent/{ndays}")
    public ResponseEntity<List<GetChecklistDto>> getChecklistByLastNDays(@PathVariable int ndays) {
        List<GetChecklistDto> checklists = checklistService.getChecklistByLastNDays(9, ndays);
        return ResponseEntity.ok(checklists);
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<List<GetChecklistDto>> getChecklistByVerificationStatus(@PathVariable int status) {
        List<GetChecklistDto> checklists = checklistService.getChecklistByVerificationStatus(10, status);
        return ResponseEntity.ok(checklists);
    }
}
