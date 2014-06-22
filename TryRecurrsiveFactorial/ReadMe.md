Problem = http://coderbyte.com/CodingArea/Results.php?ct=First%20Factorial&lan=Java

For private recurrsive functions, use this.func
If you expect the answer to be really big, use long type
You can use a function class to create a quick function

Recurrsion can be replaced by loops, but sometimes very complex loops.
```
class Function {  
  long FirstFactorial(int num) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
    
	long answer = 1;
	
	for(int loop=num; loop>0; loop--)
		answer = answer * loop;
	
    return answer;
    
  }      
}
```


