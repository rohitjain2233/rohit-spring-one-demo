package com.ranu.springdemo.autowiring.qualifier;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortune = {"Good Morning","Good evening","Good Night"};
		int random = (int) ((Math.random()*10)%3);
		return fortune[random];
	}

}
