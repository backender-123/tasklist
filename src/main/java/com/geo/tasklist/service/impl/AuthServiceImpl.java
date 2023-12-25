package com.geo.tasklist.service.impl;

import com.geo.tasklist.service.AuthService;
import com.geo.tasklist.web.dto.auth.JwtRequest;
import com.geo.tasklist.web.dto.auth.JwtResponse;

public class AuthServiceImpl implements AuthService {

    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }

}
