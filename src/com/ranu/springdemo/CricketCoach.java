package com.ranu.springdemo;

public class CricketCoach implements Coach {
	private String email;
	private String team;
	private FortuneService fortuneService;

	public CricketCoach() {
		System.out.println("CricketCoach: Inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: Inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: Inside setter method - setEmail");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter method - setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice bowl above 140kmph speed";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
