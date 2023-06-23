package assignments;

import java.util.Scanner;

public class ConvertCelsiusTemperatureIntoDifferentScales {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celsius:-");
		double Celsius = in.nextDouble();
		
		double Fahrenheit = (Celsius * 1.8)+ 32;		// convert Celsius into Fahrenheit
		int Kelvin = (int) (Celsius + 273);				// convert Celsius to Kelvin
	
		System.out.println(Celsius + " Celsius"+ " = " + Fahrenheit + " Fahrenheit");		//Print the value in Fahrenheit
		System.out.println(Celsius + " Celsius"+ " = " + Kelvin + " Kelvin");				//Print the value in Kelvin
	}

}
