package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
    // create an array of strings
	private String[] data = {
			"Today it's up to you to create the peacefulness you long for.",
			"Enjoy the good luck a companion brings you.",
			"You learn from your mistakes... You will learn a lot today.",
			"A dream you have will come true."
	};
	
	// create a random number ganerator
	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return theFortune;
	}

}
