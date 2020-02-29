package com.pomoge.pbm.mapper;

import com.pomoge.pbm.dto.UserDto;
import com.pomoge.pbm.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserEntity map(UserDto userDto);
}
