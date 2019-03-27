package com.example.sbtMybatisP;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.sbtMybatisP.entity.T_user;
import com.example.sbtMybatisP.mapper.UserMapper;

import java.util.List;
import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SbtMybatisPApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Resource
	private UserMapper um;
	@Test
	public void testSelect(){
		System.out.println("-begin select-");
		List<T_user> user = um.selectList(null);
		user.forEach(System.out::println);
	}

}
