import java.util.*; 
import java.io.*;

class Function {  
  String LetterCapitalize(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String newStr = "";
    Boolean flagIsFirstChar = true;
    Boolean flagLastCharWasSpace = false;
    
    for (char c: str.toCharArray()) {
    	if (Character.isSpaceChar(c)){
    		flagLastCharWasSpace = true;
    	}
    	if ((flagLastCharWasSpace == true && Character.isLetter(c)) || (flagIsFirstChar == true)) {
    		newStr += Character.toUpperCase(c);
    		flagIsFirstChar = false;
    		flagLastCharWasSpace = false;
    	}
    	else {
    		newStr += c;
    	}
    }
    return newStr;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterCapitalize(s.nextLine())); 
  }   
  
}








  