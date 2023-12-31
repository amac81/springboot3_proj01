package pt.bitclinic.mycoolapp.model;

import org.springframework.stereotype.Component;

import pt.bitclinic.util.MyUtils;

@Component //marks the class as a Spring bean - makes it available for dependency injection
public class BaseballCoach implements Coach{

	public BaseballCoach() {
		System.out.println("In constructor " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend " + MyUtils.generateRandomIntNumber(10, 20) + " minutes int batting practice.";
	}	
	
}
