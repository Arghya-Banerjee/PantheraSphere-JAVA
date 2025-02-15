package com.arghya.PantheraSphere.dto;

public class ChecklistSummaryDto {
    private int totalChecklists;
    private int pendingChecklists;
    private int verifiedChecklists;
    private int fakeChecklists;
    private int totalUniqueUsers;
    private int totalForestsCovered;

    public ChecklistSummaryDto(int totalChecklists, int pendingChecklists, int verifiedChecklists,
                               int fakeChecklists, int totalUniqueUsers, int totalForestsCovered) {
        this.totalChecklists = totalChecklists;
        this.pendingChecklists = pendingChecklists;
        this.verifiedChecklists = verifiedChecklists;
        this.fakeChecklists = fakeChecklists;
        this.totalUniqueUsers = totalUniqueUsers;
        this.totalForestsCovered = totalForestsCovered;
    }

    // Getters and Setters
    public int getTotalChecklists() {
        return totalChecklists;
    }

    public void setTotalChecklists(int totalChecklists) {
        this.totalChecklists = totalChecklists;
    }

    public int getPendingChecklists() {
        return pendingChecklists;
    }

    public void setPendingChecklists(int pendingChecklists) {
        this.pendingChecklists = pendingChecklists;
    }

    public int getVerifiedChecklists() {
        return verifiedChecklists;
    }

    public void setVerifiedChecklists(int verifiedChecklists) {
        this.verifiedChecklists = verifiedChecklists;
    }

    public int getFakeChecklists() {
        return fakeChecklists;
    }

    public void setFakeChecklists(int fakeChecklists) {
        this.fakeChecklists = fakeChecklists;
    }

    public int getTotalUniqueUsers() {
        return totalUniqueUsers;
    }

    public void setTotalUniqueUsers(int totalUniqueUsers) {
        this.totalUniqueUsers = totalUniqueUsers;
    }

    public int getTotalForestsCovered() {
        return totalForestsCovered;
    }

    public void setTotalForestsCovered(int totalForestsCovered) {
        this.totalForestsCovered = totalForestsCovered;
    }

    @Override
    public String toString() {
        return "ChecklistSummaryDto{" +
                "totalChecklists=" + totalChecklists +
                ", pendingChecklists=" + pendingChecklists +
                ", verifiedChecklists=" + verifiedChecklists +
                ", fakeChecklists=" + fakeChecklists +
                ", totalUniqueUsers=" + totalUniqueUsers +
                ", totalForestsCovered=" + totalForestsCovered +
                '}';
    }
}

