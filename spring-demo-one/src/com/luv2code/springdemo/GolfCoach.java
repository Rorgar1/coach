package com.luv2code.springdemo;

public class GolfCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// create a no-arg constructor
	public GolfCoach( ) {
		System.out.println("Golf Coach: inside no-arg constructor");
	}
	
	// setter method called by Spring to inject dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Golf Coach: inside setter method: setFortuneService");
		this.fortuneService = fortuneService;
	}


	public GolfCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice putting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void startUpStuff() {
		System.out.println("GolfCoach: inside method startUpStuff");
	}
	
	// add a destroy method
	public void cleanUpStuff() {
		System.out.println("GolfCoach: inside method cleanUpStuff");
	}

}
