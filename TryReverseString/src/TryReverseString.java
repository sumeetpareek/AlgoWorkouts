import java.io.*;
import java.util.*;


public class TryReverseString {

	public static void main(String[] args) {
		// Read all the lines present in a file and print them out in the reverse
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String str = input.nextLine();
			System.out.println("output = " + str);
		}
	}
	
	public static void oneTimeCommandLine() {
		String original, reverse = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Etner a string to reverse it");
		original = in.nextLine();
		
		int length = original.length();
		
		for (int i = length-1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		System.out.println("Reverse string = " + reverse);
	}

}
