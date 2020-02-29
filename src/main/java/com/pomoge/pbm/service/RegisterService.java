package com.pomoge.pbm.service;

import com.pomoge.pbm.dto.UserDto;
import com.pomoge.pbm.entity.UserEntity;
import com.pomoge.pbm.mapper.UserMapper;
import com.pomoge.pbm.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public void create(UserDto userDto) {
        UserEntity userEntity = userMapper.map(userDto);
        userRepository.save(userEntity);
    }
}
