package com.cxh.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.cxh.mybatis.bean.User;
import com.cxh.mybatis.mapper.UserMapper;
import com.cxh.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserServiceImpl
 *
 *
 * @author cxh
 *
 * @date 2019/6/11
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Object listAll(int page, int size) {


        Page pageObj = new Page(page, size);
        return userMapper.selectPage(pageObj,null);
    }

    @Override
    public int insert(User user) {
        User user2 =new User();
        user2 = user;
        userMapper.insert(user2);
        return user2.getId();
    }

    @Override
    public int remove(Integer userId) {
        return userMapper.deleteById(userId);
    }

    @Override
    public int update(User user) {
        return userMapper.updateById(user);
    }
}
