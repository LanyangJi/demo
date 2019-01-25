package com.example.demo.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.exception.MyException;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(value = MyException.class)
	public String handle(Model model, MyException e) {
		model.addAttribute("msg", e.getMessage());
		model.addAttribute("code", e.getCode());
		
		return "error";
	}
	
}
