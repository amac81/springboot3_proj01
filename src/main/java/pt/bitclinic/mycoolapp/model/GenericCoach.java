package pt.bitclinic.mycoolapp.model;

import org.springframework.stereotype.Component;

@Component //marks the class as a Spring bean - makes it available for dependency injection
//@Primary //only one class marked with @Primary
public class GenericCoach implements Coach{

	public GenericCoach() {
		System.out.println("In constructor " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do some exercice: go for a walk!";
	}
	
}
