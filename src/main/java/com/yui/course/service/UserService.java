package com.yui.course.service;

import com.yui.course.entities.User;
import com.yui.course.repositories.UserReposotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserReposotory userReposotory;

    public List<User> findAll(){
        return userReposotory.findAll();
    }

    public User findById(Long id){
        Optional<User> obj = userReposotory.findById(id);
        return obj.get();
    }

}
