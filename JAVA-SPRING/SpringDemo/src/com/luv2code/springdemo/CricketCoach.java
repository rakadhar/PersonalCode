package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//create a no arg constructor
	public CricketCoach() {
		System.out.println("cricketCoach: inside no-arg constructor");
	}
	// our setter method
	public void setFortuneService(FortuneService fortuneService) {

		System.out.println("cricketCoach: inside setter method fortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice Fast bowling : from CricketCoach class ;get daily workout";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
