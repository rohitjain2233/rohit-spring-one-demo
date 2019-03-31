package com.ranu.springdemo.di.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myCoach")
public class TennisCoach implements Coach {
	@Autowired
	FortuneService fortuneService;
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volly";
	}
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}










