package com.ranu.springdemo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.ranu.springdemo.javaconfig")
@PropertySource("classpath:sport.properties")
public class SportsConfig {
	// Define bean here if no component scan
	@Bean
	public Coach cricketCoach() {
		CricketCoach cricketCoach = new CricketCoach(happFortuneService());
		return cricketCoach;
	}
	@Bean
	public FortuneService happFortuneService() {
		return new HappyFortuneService();
	}
}
