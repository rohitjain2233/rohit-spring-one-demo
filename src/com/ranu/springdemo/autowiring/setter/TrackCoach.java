package com.ranu.springdemo.autowiring.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myCoach")
public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
		System.out.println("Default constructor");
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	
}










