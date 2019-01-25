package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.bean.Student;

@Mapper
public interface StudentMapper {

	Student findById(@Param("id") Integer id);
	
}
