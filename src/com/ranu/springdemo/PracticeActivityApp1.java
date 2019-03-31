package com.ranu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivityApp1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ranu/springdemo/applicationContext.xml");
		Coach coach = context.getBean("myCoach1",Coach.class);
		System.out.println(coach.getDailyWorkout());

	}

}
