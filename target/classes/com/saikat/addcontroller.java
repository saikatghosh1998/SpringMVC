package com.saikat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addcontroller 
{

	@RequestMapping("/add")
	public void add()
	{
		System.out.println("working..");
	}
 
}
