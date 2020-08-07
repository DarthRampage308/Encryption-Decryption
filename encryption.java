package main;

import java.util.Arrays;
import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Message: ");
		String eMessage = scanner.nextLine();
		
		encrypt(eMessage);
		decrypt(eMessage);
		
	}
	
	public static char[] encrypt(String eMessage) {
		
		double key = (Math.random() * ((9 - 3) + 1)) + 3;
		Math.round(key);
		char[] chars = eMessage.toCharArray();
		
		for(char c: chars) {
			c += key;
			System.out.print(c);
		}
		
		return chars;
		
	}
	
	public static char[] decrypt(Character chars, double key, String eMessage) {
		
		char[] newChars = Arrays.copyOf(chars, eMessage.length());
		
		for(char c: newChars) {
			c -= key;
			System.out.print(c);
		}
		
		return newChars;
		
	}

}
