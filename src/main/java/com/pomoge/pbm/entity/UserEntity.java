package com.pomoge.pbm.entity;

import lombok.Data;

@Data
public class UserEntity {

    private Long id;
    private String firstName;
    private String surname;
    private String email;
    private String password;


}
