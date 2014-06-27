Problem = http://coderbyte.com/CodingArea/information.php?ct=Letter%20Capitalize

* How to create a list of chars from an array?
```java
		List<Character> vowels = Arrays.asList('a','e','i','o','u');
```

* How to loop over chars of a string?
```java
for (char c : str.toCharArray())
```

* How to change the case of char?
```java
newChar = Character.toUpperCase(c);
```

* You could also use a string builder, probably uses less memory because of no repeated memory allocation.
```java
StringBuilder sb=new StringBuilder();
sb.append(str.charAt(i));
```

* Could have been done with a single flag, by starting out from a TRUE value
```java
      Boolean newWord = true;
      
      for(i = 0; i < Line.length(); i ++) {
      
          if (Character.isLetter(Line.charAt(i))) {
              
              if (newWord) {
              newWord = false;
              String c = Line.substring(i,i+1);
              Line = Line.substring(0,i) + c.toUpperCase() + Line.substring(i+1);
              }
          } else {
              newWord = true;
          }
```* You could also use a string builder, probably uses less memory because of no repeated memory allocation.
```java
StringBuilder sb=new StringBuilder();
sb.append(str.charAt(i));
```

* Could have been done with a single flag, by starting out from a TRUE value
```java
      Boolean newWord = true;
      
      for(i = 0; i < Line.length(); i ++) {
      
          if (Character.isLetter(Line.charAt(i))) {
              
              if (newWord) {
              newWord = false;
              String c = Line.substring(i,i+1);
              Line = Line.substring(0,i) + c.toUpperCase() + Line.substring(i+1);
              }
          } else {
              newWord = true;
          }
```* You could also use a string builder, probably uses less memory because of no repeated memory allocation.
```java
StringBuilder sb=new StringBuilder();
sb.append(str.charAt(i));
```

* Could have been done with a single flag, by starting out from a TRUE value
```java
      Boolean newWord = true;
      
      for(i = 0; i < Line.length(); i ++) {
      
          if (Character.isLetter(Line.charAt(i))) {
              
              if (newWord) {
              newWord = false;
              String c = Line.substring(i,i+1);
              Line = Line.substring(0,i) + c.toUpperCase() + Line.substring(i+1);
              }
          } else {
              newWord = true;
          }
```* You could also use a string builder, probably uses less memory because of no repeated memory allocation.
```java
StringBuilder sb=new StringBuilder();
sb.append(str.charAt(i));
```

* Could have been done with a single flag, by starting out from a TRUE value
```java
      Boolean newWord = true;
      
      for(i = 0; i < Line.length(); i ++) {
      
          if (Character.isLetter(Line.charAt(i))) {
              
              if (newWord) {
              newWord = false;
              String c = Line.substring(i,i+1);
              Line = Line.substring(0,i) + c.toUpperCase() + Line.substring(i+1);
              }
          } else {
              newWord = true;
          }
```* You could also use a string builder, probably uses less memory because of no repeated memory allocation.
```java
StringBuilder sb=new StringBuilder();
sb.append(str.charAt(i));
```

* Could have been done with a single flag, by starting out from a TRUE value
```java
      Boolean newWord = true;
      
      for(i = 0; i < Line.length(); i ++) {
      
          if (Character.isLetter(Line.charAt(i))) {
              
              if (newWord) {
              newWord = false;
              String c = Line.substring(i,i+1);
              Line = Line.substring(0,i) + c.toUpperCase() + Line.substring(i+1);
              }
          } else {
              newWord = true;
          }
```* You could also use a string builder, probably uses less memory because of no repeated memory allocation.
```java
StringBuilder sb=new StringBuilder();
sb.append(str.charAt(i));
```

* Could have been done with a single flag, by starting out from a TRUE value
```java
      Boolean newWord = true;
      
      for(i = 0; i < Line.length(); i ++) {
      
          if (Character.isLetter(Line.charAt(i))) {
              
              if (newWord) {
              newWord = false;
              String c = Line.substring(i,i+1);
              Line = Line.substring(0,i) + c.toUpperCase() + Line.substring(i+1);
              }
          } else {
              newWord = true;
          }
```* You could also use a string builder, probably uses less memory because of no repeated memory allocation.
```java
StringBuilder sb=new StringBuilder();
sb.append(str.charAt(i));
```

* Could have been done with a single flag, by starting out from a TRUE value
```java
      Boolean newWord = true;
      
      for(i = 0; i < Line.length(); i ++) {
      
          if (Character.isLetter(Line.charAt(i))) {
              
              if (newWord) {
              newWord = false;
              String c = Line.substring(i,i+1);
              Line = Line.substring(0,i) + c.toUpperCase() + Line.substring(i+1);
              }
          } else {
              newWord = true;
          }
```* You could also use a string builder, probably uses less memory because of no repeated memory allocation.
```java
StringBuilder sb=new StringBuilder();
sb.append(str.charAt(i));
```

* Could have been done with a single flag, by starting out from a TRUE value
```java
      Boolean newWord = true;
      
      for(i = 0; i < Line.length(); i ++) {
      
          if (Character.isLetter(Line.charAt(i))) {
              
              if (newWord) {
              newWord = false;
              String c = Line.substring(i,i+1);
              Line = Line.substring(0,i) + c.toUpperCase() + Line.substring(i+1);
              }
          } else {
              newWord = true;
          }
```
