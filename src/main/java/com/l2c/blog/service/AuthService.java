package com.l2c.blog.service;

import com.l2c.blog.payload.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
