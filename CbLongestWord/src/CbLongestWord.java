import java.io.*;
import java.util.*;

public class CbLongestWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		System.out.println(longestWord(str));

	}
	
	private static String longestWord(String str) {
		String longestWord = "";
		String currentWord = "";
		int str_length = str.length();
		
		for  (int i=0; i<str_length; i++){
			if (str.charAt(i) == ' ' || i == (str_length-1)) {
				if (currentWord.length() > longestWord.length()) {
					longestWord = currentWord;
				}
				currentWord = "";
			} else {
				currentWord = currentWord + str.charAt(i);
			}
		}
		
		return (currentWord.length() > longestWord.length()) ? currentWord : longestWord;
	}

}


