package com.jungle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jungle.dao.UserMapper;
import com.jungle.entity.User;
import com.jungle.service.UserService;

@Service("userService")  
public class UserServiceImpl implements UserService {  
    @Autowired  
    private UserMapper userMapper;  
    @Override  
    public User getUserById(int userId) {  
        return this.userMapper.findUserById(userId);  
    }  
  
}  