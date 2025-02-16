package com.arghya.PantheraSphere.service;

import com.arghya.PantheraSphere.dto.ChecklistContributionsDto;
import com.arghya.PantheraSphere.dto.ChecklistSummaryDto;
import com.arghya.PantheraSphere.dto.GetChecklistByUserDto;
import com.arghya.PantheraSphere.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<GetChecklistByUserDto> getChecklistsByUser(int OpMode, Long CreatedBy) {
        return userRepository.getChecklistsByUser(OpMode, CreatedBy);
    }

    public ChecklistContributionsDto getUserSummary(int OpMode, Long CreatedBy) {
        return userRepository.getUserSummary(OpMode, CreatedBy);
    }

    public List<ChecklistContributionsDto> getChecklistTopContributions(int OpMode, int NTop) {
        return userRepository.getChecklistTopContributions(OpMode, NTop);
    }

    public ChecklistSummaryDto getChecklistSummary(int OpMode) {
        return userRepository.getChecklistSummary(OpMode);
    }
}
