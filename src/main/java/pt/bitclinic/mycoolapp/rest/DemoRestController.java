package pt.bitclinic.mycoolapp.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.bitclinic.mycoolapp.model.Coach;

/*
 * Construction Injection: 
 * 
 * - Use this when we have required dependencies
 * - Generally recommended by the spring.io development team as 1st choice
 * 
 *  Setter Injection: 
 * 
 * - Use this when we have optional dependencies
 * - If dependency is not provided our app can provide reasonable default logic
 * 
 * */

@RestController
public class DemoRestController {

	// define a private field for the dependency
	private Coach myCoach;

	//Construction Injection

	// define a constructor for dependency injection

	// @Autowired // if we just have a constructor @Autowired it's optional
	/*public DemoRestController(Coach theCoach) {
		myCoach = theCoach;
	}*/

	// Setter Injection!
	@Autowired
	public void setCoach(Coach theCoach) { //method name could be anything
		myCoach = theCoach;
	}

	@GetMapping("/dailyworkout")
	public String dailyWorkout() {
		return myCoach.getDailyWorkout();
	}

}
