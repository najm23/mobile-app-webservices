package com.starapp.ws.mobileappws.service;

import com.starapp.ws.mobileappws.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto userDto);

    UserDto getUser(String email);

    UserDto getUserByUserId(String userId);

    UserDto updateUser(String id, UserDto userDto);
}
