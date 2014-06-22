Problem = http://coderbyte.com/CodingArea/information.php?ct=Longest%20Word

* char is a primitive datatype that can be compared with single quotes ''
* otherwise you should use .equals()
* http://stackoverflow.com/questions/4510136/how-to-check-if-a-char-is-equal-to-an-empty-space

* the very old ways of checking a character for alpha numerics is via 'a' or 'z'. That obviously works only for English and other concerns too.
* the better way of doing it is using .isDigit() or .isLetter() etc. 
* http://docs.oracle.com/javase/tutorial/i18n/text/charintro.html

* there are PHP, python, ruby like ways to use loops over arrays too
``` java
class Function {  
  String LongestWord(String sen) { 
  
    String[] words = sen.split("\\W");
    
    String longestWord = "";
    for (String word : words) {
      if (word.length() > longestWord.length()) {
        longestWord = word;
      }
    }
       
    return longestWord;
  }      
}
```

* just with the array was a good way of doing it too
* http://coderbyte.com/CodingArea/Results.php?ct=Longest%20Word&user=thecracker&lan=Java
```java
class Function {  
  String LongestWord(String sen) { 
		  
		int offset = 0;
		int length = 0;
		
	    String[] arr = sen.split(" ");
	    for(int i=0;i<arr.length;i++){
	    	if(arr[i].length()>length){
	    		offset = i;
	    		length = arr[i].length();
	    	}
	    }
	    	
	       
	    return arr[offset];
	    
	  }     
}
```
