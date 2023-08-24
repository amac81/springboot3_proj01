package pt.bitclinic.mycoolapp.model;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pt.bitclinic.util.MyUtils;

@Component //marks the class as a Spring bean - makes it available for dependency injection
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{
	
	public CricketCoach() {
		System.out.println("In constructor " + getClass().getSimpleName());
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for " + MyUtils.generateRandomIntNumber(10, 20) + " minutes !!!";
	}
	
}
