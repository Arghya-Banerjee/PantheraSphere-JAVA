package com.arghya.PantheraSphere.dto;

import java.sql.Date;

public class ChecklistContributionsDto {

    private Long UserID;
    private String UserName;
    private int Contributions;
    private Date LastContributionTime;

    public ChecklistContributionsDto(Long userID, String userName, int contributions, Date lastContributionTime) {
        UserID = userID;
        UserName = userName;
        Contributions = contributions;
        LastContributionTime = lastContributionTime;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long userID) {
        UserID = userID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getContributions() {
        return Contributions;
    }

    public void setContributions(int contributions) {
        Contributions = contributions;
    }

    public Date getLastContributionTime() {
        return LastContributionTime;
    }

    public void setLastContributionTime(Date lastContributionTime) {
        LastContributionTime = lastContributionTime;
    }
}
