package com.arghya.PantheraSphere.controller;

import com.arghya.PantheraSphere.dto.ChecklistContributionsDto;
import com.arghya.PantheraSphere.dto.ChecklistSummaryDto;
import com.arghya.PantheraSphere.dto.GetChecklistByUserDto;
import com.arghya.PantheraSphere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}/checklists")
    public ResponseEntity<List<GetChecklistByUserDto>> getChecklistsByUser(@PathVariable Long userId) {
        List<GetChecklistByUserDto> checklists = userService.getChecklistsByUser(3, userId);
        return ResponseEntity.ok(checklists);
    }

    @GetMapping("/{userId}/summary")
    public ResponseEntity<ChecklistContributionsDto> getUserSummary(@PathVariable Long userId) {
        ChecklistContributionsDto summary = userService.getUserSummary(13, userId);
        return ResponseEntity.ok(summary);
    }

    @GetMapping("/top-contributors/{ntop}")
    public ResponseEntity<List<ChecklistContributionsDto>> getChecklistNTopContributions(@PathVariable int ntop) {
        List<ChecklistContributionsDto> contributors = userService.getChecklistTopContributions(11, ntop);
        return ResponseEntity.ok(contributors);
    }

    @GetMapping("/top-contributors")
    public ResponseEntity<List<ChecklistContributionsDto>> getChecklistTopContributions() {
        List<ChecklistContributionsDto> contributors = userService.getChecklistTopContributions(11, 5);
        return ResponseEntity.ok(contributors);
    }

    @GetMapping("/summary")
    public ResponseEntity<ChecklistSummaryDto> getChecklistSummary() {
        ChecklistSummaryDto summary = userService.getChecklistSummary(12);
        return ResponseEntity.ok(summary);
    }
}
