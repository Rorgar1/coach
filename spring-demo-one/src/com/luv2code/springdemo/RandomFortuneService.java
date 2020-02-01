package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"Pennies add up",
			"May the Force be with you",
			"Do or do not; there is no try",
			"A fool and his money are soon parted"
	};
	
	// create random number generator
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
