package com.example.starbucks.services;

import com.example.starbucks.dto.UserDTO;
import com.example.starbucks.entity.User;
import com.example.starbucks.repositories.UserRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepos userRepos;
    @Autowired
    public UserService(UserRepos userRepos) {
        this.userRepos = userRepos;
    }
    public User create(UserDTO userDTO){
        User student = User.builder()
                .role(userDTO.getRole())
                .bio(userDTO.getBio())
                .phone(userDTO.getPhone())
                .address(userDTO.getAddress())
                .password(userDTO.getPassword())
                .build();
        return userRepos.save(student);
    }
    public List<User> getAll(){
        return userRepos.findAll();
    }
    public User update(User user){
        return userRepos.save(user);
    }
    public void delete(Long id){
        userRepos.deleteById(id);
    }
}
