package com.cxh.mybatis;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cxh.mybatis.bean.User;
import com.cxh.mybatis.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


	@Autowired
	private UserMapper userMapper;

	@Test
	public void selectPage() {

		Map<String,Object> Object =new HashMap<>();
		Object.put("username","sads");

		List<User> userList = userMapper.selectByMap(Object);
		System.out.print(userList.size());
	}

}
