package io.springboot.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.spring.services.topicService;
import spring.io.beans.TopicBean;

@RestController
public class TopicController {
	
    @Autowired
	private topicService ts ;
    @Value("${message:Hello World}" )
    private String message;
    
	@RequestMapping("/Topics/{userId}")
	public List<TopicBean> getAllTopics(@PathVariable ("userId") int userid, @RequestParam(value ="Date", required = false) int d) {
		System.out.println("User Id : "+userid);
		System.out.println("Date : "+d);
		System.out.println("Message : " + this.message);
		return ts.getAllTopics();
	}
}
