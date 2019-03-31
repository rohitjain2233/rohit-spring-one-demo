package com.ranu.springdemo.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigSpringApp {

	public static void main(String[] args) {
		//Load the spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		
		//Retrieve bean from spring container
		CricketCoach coach = context.getBean("cricketCoach",CricketCoach.class);
		
		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getTeam());
		
		//Close the context
		context.close();
		
	}
}
