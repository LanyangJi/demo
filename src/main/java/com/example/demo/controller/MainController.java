package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.exception.MyException;
import com.example.demo.mapper.StudentMapper;

@Controller
public class MainController {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@GetMapping("/student/{id}")
	@ResponseBody
	public Object findById(@PathVariable("id") Integer id) {
		return studentMapper.findById(id);
	}
	
	@GetMapping("/test")
	public String testException() {
		throw new MyException(500, "服务器端异常");
	}
	

}
