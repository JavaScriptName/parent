package com.cxh.mybatis.service;


import com.cxh.mybatis.bean.User;

/**
 * UserService
 *
 * @author cxh
 *
 * @date 2019/6/11
 */
public interface UserService {

    Object listAll(int page, int size);

    int insert(User user);

    int remove(Integer userId);

    int update(User user);

}
