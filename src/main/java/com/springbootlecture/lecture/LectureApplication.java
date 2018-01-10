package com.springbootlecture.lecture;

import com.springbootlecture.lecture.entities.Animal;
import com.springbootlecture.lecture.entities.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.AbstractApplicationContext;

@SpringBootApplication
public class LectureApplication {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(LectureApplication.class, args);
		Dog dog = ac.getBean(Dog.class);
		System.out.println(dog.getClass().getSimpleName());
		((AbstractApplicationContext)ac).close();
	}

	@Bean
	public Animal getDog(){
		return new Dog();
	}
}
