package pt.bitclinic.util;

import java.util.Random;

public class MyUtils {
	public static int generateRandomIntNumber(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("Max must be greater than min");
		}

		Random random = new Random();
		// Use the nextInt method to generate a random integer within the specified
		// range
		int randomNumber = random.nextInt((max - min) + 1) + min;
		return randomNumber;
	}
}
