package com.ranu.springdemo;

public class SoccerCoach implements Coach {
	FortuneService randomFortuneService;
	
	SoccerCoach(){
		
	}
	public void setRandomFortuneService(FortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice Goal keeping for 3 hours";
	}

	@Override
	public String getDailyFortune() {
		return randomFortuneService.getFortune();
	}

}
