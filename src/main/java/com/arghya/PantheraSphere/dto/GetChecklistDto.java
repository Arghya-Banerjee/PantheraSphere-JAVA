package com.arghya.PantheraSphere.dto;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;

public class GetChecklistDto {

    private Long ChecklistID;
    private Long CreatedBy;
    private String ForestName;
    private Date SafariDate;
    private Time StartTime;
    private int TotalTigers;
    private String GuideName;
    private String DriverName;

    public GetChecklistDto(){}

    public GetChecklistDto(Long checklistID, Long createdBy, String forestName, Date safariDate, Time startTime, int totalTigers, String guideName, String driverName) {
        ChecklistID = checklistID;
        CreatedBy = createdBy;
        ForestName = forestName;
        SafariDate = safariDate;
        StartTime = startTime;
        TotalTigers = totalTigers;
        GuideName = guideName;
        DriverName = driverName;
    }

    public Long getChecklistID() {
        return ChecklistID;
    }

    public void setChecklistID(Long checklistID) {
        ChecklistID = checklistID;
    }

    public String getForestName() {
        return ForestName;
    }

    public void setForestName(String forestName) {
        ForestName = forestName;
    }

    public Date getSafariDate() {
        return SafariDate;
    }

    public void setSafariDate(Date safariDate) {
        SafariDate = safariDate;
    }

    public Time getStartTime() {
        return StartTime;
    }

    public void setStartTime(Time startTime) {
        StartTime = startTime;
    }

    public int getTotalTigers() {
        return TotalTigers;
    }

    public void setTotalTigers(int totalTigers) {
        TotalTigers = totalTigers;
    }

    public String getGuideName() {
        return GuideName;
    }

    public void setGuideName(String guideName) {
        GuideName = guideName;
    }

    public String getDriverName() {
        return DriverName;
    }

    public void setDriverName(String driverName) {
        DriverName = driverName;
    }

    public Long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Long createdBy) {
        CreatedBy = createdBy;
    }
}
