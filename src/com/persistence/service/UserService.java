package com.persistence.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persistence.mapper.UserMapper;
import com.persistence.model.*;

/**
 * Created by Administrator on 2017/5/15 0015.
 */
@Service("userService")
public class UserService  {
    @Autowired
    private UserMapper userMapper;

    public User getUser( String id) {
        return userMapper.getUserById(id);
    }
    
}
