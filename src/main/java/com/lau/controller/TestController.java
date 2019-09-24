package com.lau.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("test1")
	public String test1() {
		
		return "test";
	}
	@RequestMapping("test2")
	public String test2() {
		
		return "redirect:test.jsp";
	}
	@RequestMapping("test3")
	public String test3() {
		
		return "forward:test.jsp";
	}
	@RequestMapping("test4")
	public String test4() {
		
		return "redirect:test";
	}
}
