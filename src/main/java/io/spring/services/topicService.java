package io.spring.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import spring.io.beans.TopicBean;

@Service
public class topicService {
 
	
	public List<TopicBean> getAllTopics(){
		return Arrays.asList(new TopicBean("SpringBoot", "1", "Spring Boot Tutorial"),
				new TopicBean("Micro services", "2", "Micro services Tutorial"),
				new TopicBean("Amazone webservices", "3", "Amazone Webserices Tutorial"));
	}
}
