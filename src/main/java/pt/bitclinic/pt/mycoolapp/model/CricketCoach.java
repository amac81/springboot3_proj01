package pt.bitclinic.pt.mycoolapp.model;

import org.springframework.stereotype.Component;

@Component //marks the class as a Spring bean - makes it available for dependency injection
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes !!!";
	}

}
