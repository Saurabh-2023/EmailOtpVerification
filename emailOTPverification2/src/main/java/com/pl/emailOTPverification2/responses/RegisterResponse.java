package com.pl.emailOTPverification2.responses;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegisterResponse
{
    private String userName;
    private String email;


}
