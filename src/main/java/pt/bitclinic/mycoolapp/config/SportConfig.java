package pt.bitclinic.mycoolapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pt.bitclinic.mycoolapp.model.Coach;
import pt.bitclinic.mycoolapp.model.SwimCoach;

/* Java Config Bean
 * @Bean annotation
 * 
 * Make an existing third-party class available to Spring Framework (Spring Bean) 
 *  * 
 * */


@Configuration
public class SportConfig {

    @Bean("aquatic") //bean Id
    protected Coach swimCoach() {
		return new SwimCoach();
	}
}
