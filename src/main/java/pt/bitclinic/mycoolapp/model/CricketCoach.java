package pt.bitclinic.mycoolapp.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import pt.bitclinic.util.MyUtils;

@Component //marks the class as a Spring bean - makes it available for dependency injection
public class CricketCoach implements Coach{
	
	public CricketCoach() {
		System.out.println("In constructor " + getClass().getSimpleName());
	}
	
	@PostConstruct
	public void doMyStartupStuff() 
	{
		System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
	}
	
	@PreDestroy
	public void doMyCleanupStuff() 
	{
		System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for " + MyUtils.generateRandomIntNumber(10, 20) + " minutes !!!";
	}
	
}
