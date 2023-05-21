package com.example.starbucks.Dto;

import com.example.starbucks.entity.Role;
import lombok.Data;

@Data
public class UserDTO {
    private Role role;
    private String bio;
    private Integer phone;
    private String address;
    private Integer password;
}
