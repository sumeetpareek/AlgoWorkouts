import java.util.*; 
import java.io.*;

class Function {  
  String LetterChanges(String str) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    String newStr = "";
    Character newChar;
    int strLength = str.length();
    List<Character> vowels = Arrays.asList('a','e','i','o','u');
    
    for (int i = 0; i < strLength; i++) {
      if (Character.isLetter(str.charAt(i))) {
        if (str.charAt(i) == 'z') {
          newChar = 'a';
        }
        else if (str.charAt(i) == 'Z') {
          newChar = 'Z';
        }
        else {
          newChar = str.charAt(i);
          newChar++;
        }
        if (vowels.contains(newChar)) {
          newChar = Character.toUpperCase(newChar);
        }
      }
                 else {
                   newChar = str.charAt(i);
                 }
                 newStr = newStr + newChar;
                 }
                   
        
       
    return newStr;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner  s = new Scanner(System.in);
    Function c = new Function();
    System.out.print(c.LetterChanges(s.nextLine())); 
  }   
  
}








  