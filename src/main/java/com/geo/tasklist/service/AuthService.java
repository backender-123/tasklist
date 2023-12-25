package com.geo.tasklist.service;

import com.geo.tasklist.web.dto.auth.JwtRequest;
import com.geo.tasklist.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
