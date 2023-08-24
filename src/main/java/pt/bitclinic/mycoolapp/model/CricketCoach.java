package pt.bitclinic.mycoolapp.model;

import org.springframework.stereotype.Component;

import pt.bitclinic.util.MyUtils;

@Component //marks the class as a Spring bean - makes it available for dependency injection
public class CricketCoach implements Coach{

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for " + MyUtils.generateRandomIntNumber(10, 20) + " minutes !!!";
	}
	
}
