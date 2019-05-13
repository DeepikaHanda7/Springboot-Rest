package io.springboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	@Value("${message: Hello default}")
    private String message;
	
	@RequestMapping("/hello")
	public String sayHi() {
		return this.message;
	}
	
}
