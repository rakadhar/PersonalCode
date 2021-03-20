package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private filed for the dependency
	private FortuneService fortuneService;
	
	//define  constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		         fortuneService = theFortuneService;
	}
	
	
     @Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortune service to get a fortune
		return fortuneService.getFortune();
	}

}
