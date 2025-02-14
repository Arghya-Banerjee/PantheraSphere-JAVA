package com.arghya.PantheraSphere.dto;

public class RoleDto {

    private Long RoleID;
    private String RoleName;

    public RoleDto() {}

    public RoleDto(Long roleID, String roleName) {
        this.RoleID = roleID;
        this.RoleName = roleName;
    }

    // Getters and Setters
    public Long getRoleID() {
        return RoleID;
    }

    public void setRoleID(Long roleID) {
        RoleID = roleID;
    }

    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String roleName) {
        RoleName = roleName;
    }
}
