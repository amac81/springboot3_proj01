package pt.bitclinic.mycoolapp.model;

import org.springframework.stereotype.Component;

@Component //marks the class as a Spring bean - makes it available for dependency injection
public class TennisCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}
	
}
