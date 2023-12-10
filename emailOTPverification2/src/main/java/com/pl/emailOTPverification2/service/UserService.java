package com.pl.emailOTPverification2.service;

import com.pl.emailOTPverification2.requests.RegisterRequest;
import com.pl.emailOTPverification2.responses.RegisterResponse;

public interface UserService
{
    RegisterResponse register(RegisterRequest registerRequest);
    void verify(String email,String otp);



}
