package com.zhf.dao;

import com.zhf.pojo.SpringUsers;

/**
 * Created on 2020/1/10 0010.
 */
public interface SpringUsersMapper {
    SpringUsers findUserById(int id)throws Exception;

}
