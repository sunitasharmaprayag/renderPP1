package com.example.renderExamDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
@RequestMapping("/")
	String gotoIndex()
	{
		return "index";
	}
}
