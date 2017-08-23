package com.persistence.mapper;


import org.apache.ibatis.annotations.Param;

import com.persistence.model.*;

/**
 * Created by Administrator on 2017/5/15 0015.
 */
public interface UserMapper {
    public User getUserById(@Param(value="id") String id);
}
