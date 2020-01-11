package com.zhf.service;

import com.zhf.dao.SpringUsersMapper;
import com.zhf.pojo.SpringUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created on 2020/1/10 0010.
 */
@Component
public class UserService {
    @Resource
    private SpringUsersMapper usersMapper;
    public SpringUsers findUser(int id)throws Exception{
        return usersMapper.findUserById(id);
    }
}
