package Pekan6_2511532005;

import java.util.Scanner;

public class doWhile_2511532005 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		String phrase;
		do {
			System.out.print("Input Password: ");
			phrase = console.next();
		} while (!phrase.equals("abcd"));
		
	}
	
	

}
