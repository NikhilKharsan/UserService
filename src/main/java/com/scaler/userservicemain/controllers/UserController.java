package com.scaler.userservicemain.controllers;

import com.scaler.userservicemain.dtos.*;
import com.scaler.userservicemain.models.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    public LoginResponseDto login(@RequestBody LoginRequestDto requestDto){
        return null;
    }

    public void logout(@RequestBody LogoutRequestDto requestDto){

    }

    public SignupResponseDto signup(@RequestBody SignupRequestDto requestDto){
        return null;
    }

    public UserDto validateToken(String token){
        return null;
    }
}
