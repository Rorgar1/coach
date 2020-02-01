package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	
	// create no arg constructor
	public CricketCoach() { 
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	//setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - set FortuneService");
		this.fortuneService = fortuneService;
	}
	
	public String getEmailAddress() {
		System.out.println("CricketCoach: inside setter method - set EmailAddress");
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - set Team");
		this.team = team;
	}
	

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	//add new fields for email address and team
		private String emailAddress;
		private String team;
		

}
