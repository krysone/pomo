package com.pomoge.pbm.service;

import com.pomoge.pbm.dto.UserDto;
import com.pomoge.pbm.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {

    public UserEntity mapDto2Entity(UserDto userDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setSurname(userDto.getSurname());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setPassword(userDto.getPassword());
        return userEntity;
    }
}
