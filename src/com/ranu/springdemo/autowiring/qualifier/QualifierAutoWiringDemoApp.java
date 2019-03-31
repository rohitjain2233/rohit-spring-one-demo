package com.ranu.springdemo.autowiring.qualifier;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierAutoWiringDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ranu/springdemo/autowiring/qualifier/applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		context.close();
	}
}
