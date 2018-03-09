package edu.albany.hw2.morse;

import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		MorseCodeStorage morseObj = new MorseCodeStorage();// creating MorseCodeStorage object
		Scanner input = new Scanner(System.in); // creating a scanner to take user input

		System.out.println("Enter a sentence");
		String holdInput = input.nextLine().toLowerCase();
		int i = 0; //used to stop the while loop and index the input
		while (i < holdInput.length()) {
			System.out.print(morseObj.getMorseCode().get(holdInput.charAt(i)));
			i++;
		}
		input.close();// closing the scanner
	}// end main method
}// end DriverCLass
