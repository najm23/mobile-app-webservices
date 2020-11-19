package com.starapp.ws.mobileappws.service.impl;

import com.starapp.ws.mobileappws.UserRepository;
import com.starapp.ws.mobileappws.io.entity.UserEntity;
import com.starapp.ws.mobileappws.service.UserService;
import com.starapp.ws.mobileappws.shared.dto.UserDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto user) {

        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);

        userEntity.setUserId("testUserId");
        userEntity.setEncryptedPassword("testEncryptedUserPassword");
        UserEntity storedUserDetails = userRepository.save(userEntity);

        UserDto returnValue = new UserDto();
        BeanUtils.copyProperties(storedUserDetails, returnValue);

        return returnValue;
    }
}