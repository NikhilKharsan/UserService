package com.scaler.userservicemain.services;

import com.scaler.userservicemain.models.Token;
import com.scaler.userservicemain.models.User;

public class UserServiceImpl implements UserService {
    @Override
    public Token login(String email, String password) {
        return null;
    }

    @Override
    public User signUp(String name, String email, String password) {
        return null;
    }

    @Override
    public User validateToken(String token) {
        return null;
    }

    @Override
    public void logout(String token) {

    }
}
