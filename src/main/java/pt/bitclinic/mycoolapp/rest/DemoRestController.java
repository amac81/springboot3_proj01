package pt.bitclinic.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pt.bitclinic.util.Coach;

@RestController
public class DemoRestController {
	
	// define a private field for the dependency	
	private Coach myCoach;
	
	// define a constructor for dependency injection
	
	//@Autowired // if we just have a constructor @Autowired it's optional 
	public DemoRestController(Coach theCoach) {
		myCoach = theCoach;
	}
	
	@GetMapping("/dailyworkout")
	public String dailyWorkout() {
		return myCoach.getDailyWorkout();
	}
	

}
