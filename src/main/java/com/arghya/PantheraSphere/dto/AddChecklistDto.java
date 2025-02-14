package com.arghya.PantheraSphere.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;
import java.sql.Time;

public class AddChecklistDto {

    @JsonProperty("ForestID")
    private Long ForestID;

    @JsonProperty("CreatedBy")
    private Long CreatedBy;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date SafariDate;

    @JsonFormat(pattern = "HH:mm:ss")
    private Time StartTime;

    @JsonProperty("GuideID")
    private Long GuideID;

    @JsonProperty("DriverID")
    private Long DriverID;

    public AddChecklistDto(Long forestID, Long createdBy, Date safariDate, Time startTime, Long guideID, Long driverID) {
        ForestID = forestID;
        CreatedBy = createdBy;
        SafariDate = safariDate;
        StartTime = startTime;
        GuideID = guideID;
        DriverID = driverID;
    }

    public Long getForestID() {
        return ForestID;
    }

    public void setForesID(Long foresID) {
        ForestID = foresID;
    }

    public Long getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Long createdBy) {
        CreatedBy = createdBy;
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

    public Long getGuideID() {
        return GuideID;
    }

    public void setGuideID(Long guideID) {
        GuideID = guideID;
    }

    public Long getDriverID() {
        return DriverID;
    }

    public void setDriverID(Long driverID) {
        DriverID = driverID;
    }

    @Override
    public String toString() {
        return "AddChecklistDto{" +
                "ForestID=" + ForestID +
                ", CreatedBy=" + CreatedBy +
                ", SafariDate=" + SafariDate +
                ", StartTime=" + StartTime +
                ", GuideID=" + GuideID +
                ", DriverID=" + DriverID +
                '}';
    }
}
