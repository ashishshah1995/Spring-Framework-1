package com.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	// define a default constructor
	public TennisCoach() {
		System.out.println("Inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: Inside doMyStartupStuff()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("TennisCoach: Inside doMyCleanupStuff()");
	}
	/*
	// define a setter method 
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("Inside setFortuneService");
		fortuneService = theFortuneService;
	}
	
	//Constructor Injection
	
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService= theFortuneService;
	}
	*/
	@Override
	public String getDailyWorkout() {
		return "Practice your volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
