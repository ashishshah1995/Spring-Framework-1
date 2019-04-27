package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {

		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		//check if they are same object
		boolean result = (theCoach==alphaCoach);
		
		//print out results
		System.out.println("Pointing to same object " +result);
		System.out.println("Memory loaction for theCoach: "+theCoach);
		System.out.println("Memory loaction for alphaCoach: "+alphaCoach);

		//close the context
		context.close();
		
	}

}
