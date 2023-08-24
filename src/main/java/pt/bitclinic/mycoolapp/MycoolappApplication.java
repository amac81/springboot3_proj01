package pt.bitclinic.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Explicitly list base packages to scan
@SpringBootApplication(
		scanBasePackages = {"pt.bitclinic.mycoolapp", "pt.bitclinic.util"}
)
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

}
