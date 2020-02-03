package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() { }	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it!: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void startUpStuff() {
		System.out.println("TrackCoach: inside method startUpStuff");
	}
	
	// add a destroy method
	public void cleanUpStuff() {
		System.out.println("TrackCoach: inside method cleanUpStuff");
	}
	
	
	
	

}
