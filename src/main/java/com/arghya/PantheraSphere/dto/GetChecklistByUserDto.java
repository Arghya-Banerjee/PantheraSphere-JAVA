package com.arghya.PantheraSphere.dto;

import java.sql.Date;
import java.sql.Time;

public class GetChecklistByUserDto { // ✅ New DTO without CreatedBy
    private Long ChecklistID;
    private String ForestName;
    private Date SafariDate;
    private Time StartTime;
    private int TotalTigers;
    private String GuideName;
    private String DriverName;

    public GetChecklistByUserDto() {}

    public GetChecklistByUserDto(Long checklistID, String forestName, Date safariDate,
                                 Time startTime, int totalTigers, String guideName, String driverName) {
        this.ChecklistID = checklistID;
        this.ForestName = forestName;
        this.SafariDate = safariDate;
        this.StartTime = startTime;
        this.TotalTigers = totalTigers;
        this.GuideName = guideName;
        this.DriverName = driverName;
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
}

