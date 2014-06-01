/**
 * problem = http://www.codechef.com/problems/A1
 * 
 * solution = http://www.codechef.com/viewsolution/3786975
 */

import java.io.*;
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
			ArrayList<Integer> list = new ArrayList<Integer>();
			int sum = Integer.parseInt(str.substring(bl+1));
			while (count_set < set_size){
				str = br.readLine();
				int item = Integer.parseInt(str);
				list.add(item);
				count_set++;
			}
			// A number either belongs to the subset or not, if it does then lets remove it from the list and reduce the sum
//			int number = list.remove(0);
			System.out.println("Set of "+ set_size +" item = ("+ list.toString() +")");
			System.out.println(subset(list, 0, sum)?sum+"=Yes":sum+"=No");
			// Print set of N = N items by comma
			System.out.println("Set of "+ set_size +" item = ("+ list.toString() +")");
			count++;
		}
//		System.out.println("Total cases = "+ t);

	}
	
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

}
