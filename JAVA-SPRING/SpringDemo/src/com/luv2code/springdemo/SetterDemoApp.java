package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//retrieve bean from spring container
		
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkOut());

		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
		
	}

}
