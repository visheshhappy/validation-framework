package com.vishesh.validation.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vishesh.validation.pojo.Person;
import com.vishesh.validation.service.PersonService;

public class ValidationClient {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Vishesh");
		p.setEmail("a");
		p.setAge(25);
		p.setAddress("abc");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-customer.xml");
		PersonService ps  = (PersonService) context.getBean("personService");
		ps.savePerson(p);

	}

}
