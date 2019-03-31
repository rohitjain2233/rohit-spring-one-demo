package com.ranu.springdemo.di.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDIDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ranu/springdemo/di/annotation/applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		System.out.println("Task: "+coach.getDailyWorkout());
		System.out.println("Fortune: "+coach.getDailyFortune());
		context.close();
	}
}
