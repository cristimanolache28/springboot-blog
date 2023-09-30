package com.l2c.blog.service;

import com.l2c.blog.payload.LoginDto;
import com.l2c.blog.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
