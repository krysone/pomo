package com.pomoge.pbm.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class UserDto {

    private String firstName;
    private String surname;
    private String email;
    private String password;

}
