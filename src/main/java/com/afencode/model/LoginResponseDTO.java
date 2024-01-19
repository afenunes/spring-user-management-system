package com.afencode.model;

public class LoginResponseDTO {

    private ApplicationUser user;
    private String jwt;

    // TODO: Remove User info from login (or at least keep only what is necessary)
    public LoginResponseDTO(ApplicationUser user, String jwt) {
        this.user = user;
        this.jwt = jwt;
    }

    public ApplicationUser getUser() {
        return user;
    }
    public void setUser(ApplicationUser user) {
        this.user = user;
    }
    public String getJwt() {
        return jwt;
    }
    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
    
}
