package com.cobee.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/info")
	public String info() {
		return "success";
	}

	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello World";
	}

}
