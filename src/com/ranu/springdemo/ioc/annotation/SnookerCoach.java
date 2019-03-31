package com.ranu.springdemo.ioc.annotation;

import org.springframework.stereotype.Component;

import com.ranu.springdemo.ioc.annotation.Coach;

@Component
public class SnookerCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice pull back today";
	}
}
