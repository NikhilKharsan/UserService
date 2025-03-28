package com.scaler.userservicemain.services;
import com.scaler.userservicemain.models.Token;
import com.scaler.userservicemain.models.User;

public interface UserService {
    public Token login(String email, String password);
    public User signUp(String name,String email, String password);
    public User validateToken(String token);
    public void logout(String token);

}
