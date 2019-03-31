package com.ranu.springdemo.ioc.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ranu/springdemo/ioc/annotation/applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach snookerCoach = context.getBean("snookerCoach", Coach.class);
		System.out.println("Tennis coach: "+coach.getDailyWorkout());
		System.out.println("Snooker coach: "+snookerCoach.getDailyWorkout());
		context.close();
	}
}
