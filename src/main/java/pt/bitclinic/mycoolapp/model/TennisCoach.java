package pt.bitclinic.mycoolapp.model;

import org.springframework.stereotype.Component;

@Component //marks the class as a Spring bean - makes it available for dependency injection
//@Lazy
public class TennisCoach implements Coach{

	public TennisCoach() {
		System.out.println("In constructor " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}
	
}
