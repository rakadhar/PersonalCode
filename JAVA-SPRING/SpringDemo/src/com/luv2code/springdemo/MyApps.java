package com.luv2code.springdemo;

public class MyApps {

	public static void main(String[] args) {	
		
		//create the object 
		//BaseballCoach theCoach = new BaseballCoach(); //before interface
		//Coach theCoach = new BaseballCoach(); //after interface
		  Coach theCoach = new TrackCoach();
		//use the object
        System.out.println(theCoach.getDailyWorkOut());
	  }


}

