package test.java;

import java.io.IOException;
import java.util.Scanner;

public class JavaTestApp {

	public static void main(String[] args) {
		System.out.println("Hello Worlds");
		int i = 0;
		try {
			i = System.in.read();
		} catch (IOException e) {
			System.err.println(e);
		}//returns ASCII code of 1st character  
		System.out.println((char)i);
		
//		String input = "test";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		String input = scanner.nextLine();
		System.out.println(input);
		
		Scanner scanner2 = new Scanner(System.in);
		input = scanner2.nextLine();
		System.out.println(input);
	}

}
