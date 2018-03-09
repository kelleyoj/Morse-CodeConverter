package edu.albany.hw2.morse;

import java.util.HashMap;
/*
 * To store the morse code I choose to use a HashMap,
 * because I never used it before and wanted to try using it 
 * and I wanted to seee if I could do the hw, without 
 * using a char or string array
 */

public class MorseCodeStorage {
	HashMap<Character, String> morse = new HashMap<Character, String>();

	/*
	 * Storing the morse code table
	 */
	public MorseCodeStorage() {
		morse.put(' ', " ");
		morse.put(',', "--..--");
		morse.put('.', ".-.-.-");
		morse.put('?', "..--..");
		morse.put('0', "-----");
		morse.put('1', ".----");
		morse.put('2', "..---");
		morse.put('3', "...--");
		morse.put('4', "....-");
		morse.put('5', ".....");
		morse.put('6', "-....");
		morse.put('7', "--...");
		morse.put('8', "---..");
		morse.put('9', "----.");
		morse.put('a', ".-");
		morse.put('b', "-...");
		morse.put('c', "-.-.");
		morse.put('d', "-..");
		morse.put('e', ".");
		morse.put('f', "..-.");
		morse.put('g', "--.");
		morse.put('h', "....");
		morse.put('i', "..");
		morse.put('j', ".---");
		morse.put('k', "-.-");
		morse.put('l', ".-..");
		morse.put('m', "--");
		morse.put('n', "-.");
		morse.put('o', "---");
		morse.put('p', ".--.");
		morse.put('q', "--.-");
		morse.put('r', ".-.");
		morse.put('s', "...");
		morse.put('t', "-");
		morse.put('u', "..-");
		morse.put('v', "...-");
		morse.put('w', ".--");
		morse.put('x', "-..-");
		morse.put('y', "-.--");
		morse.put('z', "--..");
	}

	// returning the HashMap
	public HashMap<Character, String> getMorseCode() {
		return morse;
	}// end getMorseCode metohd
}// end MorseCodeStorage