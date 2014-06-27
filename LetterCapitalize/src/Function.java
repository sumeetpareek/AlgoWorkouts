import java.io.*;
import java.util.*;

public class Function {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		Function c = new Function();
		System.out.println(c.letterCapitalize(str));
		
	}
	
	String letterCapitalize(String str){
		List<Character> vowels = Arrays.asList('a','e','i','o','u');
		String newStr = "";
		
		for (char c : str.toCharArray()) {
			if (vowels.contains(c)) {
				newStr += Character.toUpperCase(c);
			}
			else {
				newStr += c;
			}
		}
		
		return newStr;
	}

}
