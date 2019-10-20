package com.lnt.hr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Check {

	@RequestMapping("/check.hr")
	public String check() {
		return "ok";
	}
}
