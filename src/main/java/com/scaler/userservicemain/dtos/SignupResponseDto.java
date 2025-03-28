package com.scaler.userservicemain.dtos;

import com.scaler.userservicemain.models.User;

public class SignupResponseDto {
    private User user; // TODO: Remove user model and use email and password
    private ResponseStatus responseStatus;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
