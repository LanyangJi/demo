package com.example.demo;

import org.junit.Test; 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.bean.Student;
import com.example.demo.mapper.StudentMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Autowired
	private StudentMapper studentMapper;

	@Test
	public void contextLoads() {
		Student student = studentMapper.findById(1);
		System.out.println(student);
	}

}

