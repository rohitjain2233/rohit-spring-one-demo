package com.ranu.springdemo.beanscope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/ranu/springdemo/beanscope/applicationContext.xml");
		Coach coach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		boolean result = (coach == alphaCoach);
		System.out.println("\nPointing to same object : " + result);
		System.out.println("\nMemory location for the coach: " + coach);
		System.out.println("\nMemory location for the alphaCoach: " + alphaCoach + "\n");
		context.close();
	}
}
