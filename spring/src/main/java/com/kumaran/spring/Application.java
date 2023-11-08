package com.kumaran.spring;

import com.kumaran.spring.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

@Autowired
private TodoRepository todoRepository;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	public  void run(String ...args)throws Exception{
		System.out.println(todoRepository);
	}

}
