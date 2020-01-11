package com.zhf.test;

import com.zhf.dao.SpringUsersMapper;
import com.zhf.pojo.SpringUsers;
import com.zhf.service.UserService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created on 2020/1/10 0010.
 */
public class App {
    ApplicationContext context = new ClassPathXmlApplicationContext("spring/bean.xml","spring/bean-*.xml");

    @Test
    public void test(){
        SqlSessionFactory sqlSessionFactory = (SqlSessionFactory)context.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        SpringUsersMapper springUsersMapper = sqlSession.getMapper(SpringUsersMapper.class);
        try {
            SpringUsers springUsers = springUsersMapper.findUserById(1);
            System.out.println(springUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testService()throws Exception{
        UserService userService = (UserService) context.getBean("userService");
        SpringUsers user = userService.findUser(6);
        System.out.println(user);
    }
}
