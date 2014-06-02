/**
 * problem = http://www.codechef.com/problems/A1
 * 
 * solution = http://www.codechef.com/viewsolution/3786975
 */

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;


public class A1Prob {

	public static void main(String[] args) throws Exception{
		// To read from the input we use the input stream reader, which is wrapped in a buffer
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// From the buffer object we get the line
		String str = br.readLine();
		int count = 0;
		// If we know the line is just number we parse it as a int
		int t = Integer.parseInt(str);
		
		while (count < t){
			str = br.readLine();
			// If we know the line has numbers separated by space, we parse substrings of it.
			int bl = str.indexOf(' ');
			int set_size = Integer.parseInt(str.substring(0, bl));
			int count_set = 0;
			// Use an array to hold all numbers of a set
			int[] arr = new int[set_size];
			int sum = Integer.parseInt(str.substring(bl+1));
			
			// Populate all set elements in the array
			while (count_set < set_size){
				str = br.readLine();
				int item = Integer.parseInt(str);
				arr[count_set] = item;
				count_set++;
			}
			
			// Check if `arr` has subset where elements add up to `sum`
			// This first of the recursive call here gives the "outermost return", else are all "inner returns"
			System.out.println(subset_arr(arr, set_size, sum)?"Yes":"No");
			
			count++;
		}
	}
	
	/** 
	 * REDUNDANT - Using arraylists was not a good idea :-( (they are also passed by reference and we do not want to exclude items)
	 * 
	 * @param list
	 * @param num
	 * @param sum
	 * @return
	 */
	public static boolean subset(ArrayList<Integer> list, int num, int sum) {
		// We have touched the right numbers removing them from the sum to reach 0. So our subset is found.
		if (sum == 0) {
			return true;
		}
		// If we hit empty pool, and the sum is still not 0, we touched numbers in a subset that do not add up.
		if (list.isEmpty() && sum!=0) {
			return false;
		}
		// If neither is the case, we do not consider the current number if it is greater than sum, and keep sum unchanged.
		// But otherwise it could still belong OR not.. so we change the sum or not.
		
		if (num > sum) {
			int newnum = list.remove(0);
			//TODO use the size of the array list and not actually remove it.
			System.out.println("Number ignored = "+num);
			System.out.println("current set = ("+ list.toString() +")");
			return subset(list, newnum, sum);
		}
		//
		else {
			int newnum = list.remove(0);
			System.out.println("Number considered = "+num);
			System.out.println("current set = ("+ list.toString() +")");
			return subset(list, newnum, sum-newnum) || subset(list, newnum, sum); 
		}
	}
	
	public static boolean subset_arr(int[] arr, int n, int sum) {
		// Do the "outermost return of the recursive function first.
		// We have touched the right numbers removing them from the sum to reach 0. So our subset is found.
		if (sum == 0) {
			return true;
		}
		// If we hit empty pool, and the sum is still not 0, we touched numbers in a subset that do not add up.
		if (n==0 && sum!=0) {
			return false;
		}
		// If neither is the case, we do not consider the current number if it is greater than sum, and keep sum unchanged.
		// But otherwise it could still belong OR not.. so we change the sum or not.
		if (arr[n-1] > sum) {
			return subset_arr(arr, n-1, sum);
		}
		else {
			return subset_arr(arr, n-1, sum-arr[n-1]) || subset_arr(arr, n-1, sum);
		}
	}

}
