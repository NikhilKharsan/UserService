package com.scaler.userservicemain.dtos;


import com.scaler.userservicemain.models.Token;

public class LoginResponseDto {
    private Token token;

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }
}
