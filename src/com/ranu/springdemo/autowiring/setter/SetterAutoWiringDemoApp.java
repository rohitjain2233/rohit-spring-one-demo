package com.ranu.springdemo.autowiring.setter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAutoWiringDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ranu/springdemo/autowiring/setter/applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		context.close();
	}
}
