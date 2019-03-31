package com.ranu.springdemo.randomfortune.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String fileName = "C:\\Users\\rohjain3\\eclipse-workspace\\spring-demo-one\\src\\com\\ranu\\springdemo\\randomfortune\\file\\fortune-data.txt";
	private List<String> theFortunes;

	// create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(theFortunes.size());

		String tempFortune = theFortunes.get(index);

		return tempFortune;
	}
	
	@PostConstruct
	public void startUp() {
		File theFile = new File(fileName);
		System.out.println("Reading fortunes from file: " + theFile);
		System.out.println("File exists: " + theFile.exists());
		// initialize array list
		theFortunes = new ArrayList<String>();
		// read fortunes from file
		try (BufferedReader br = new BufferedReader(
				new FileReader(theFile))) {

			String tempLine;

			while ((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
