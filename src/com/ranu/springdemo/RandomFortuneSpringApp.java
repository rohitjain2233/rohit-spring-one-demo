package com.ranu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneSpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ranu/springdemo/applicationContext.xml");
		Coach coach = context.getBean("mySoccerCoach",Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		context.close();
	}

}
