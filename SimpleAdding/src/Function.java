import java.io.*;
import java.util.*;

public class Function {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Function c = new Function();
		int num = input.nextInt();
		System.out.println(c.SimpleAdding(num));

	}
	
	private int SimpleAdding(int num){
		int sum = 0;
		for (int i=1; i<=num; i++){
			sum = sum + i;
		}
		return sum;
	}

}
