package Acasa;

import java.util.Scanner;

public class TestTR7 {
	public static double fahrenheitToCelsius(double temperature) {

		double temperature;
		Scanner in = new Scanner(System.in);
		System.out.println("Introduceti gradele Fahrenheit:");

		temperature = in.nextInt();
		temperature = ((temperature - 32) * 5 / 9);

		System.out.println("fahrenheitToCelsius = " + temperature);

	}

}
