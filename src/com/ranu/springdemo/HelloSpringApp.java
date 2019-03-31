package com.ranu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ranu/springdemo/applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach coach = context.getBean("myCoach",Coach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		//Close the context
		context.close();
		
	}

}
