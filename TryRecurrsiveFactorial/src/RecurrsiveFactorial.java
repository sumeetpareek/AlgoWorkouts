import java.io.*;
import java.util.*;

public class RecurrsiveFactorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(factorial(n));

	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if (n == 1) {
			return n;
		} else {
			return n * factorial(n-1);
		}
	}

}
