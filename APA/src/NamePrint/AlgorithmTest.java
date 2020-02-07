package NamePrint;

import java.util.Scanner;

public class AlgorithmTest {
	private static double Fahrenheit = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the temperature in Fahrenheit:");
			Fahrenheit = scanner.nextDouble();
			System.out.println("Fahrenheit temperature is: " + Fahrenheit);
			System.out.println("Celsius temperature is:" + (100.0/180.0)*(Fahrenheit - 32.0));
		}
	}

}
