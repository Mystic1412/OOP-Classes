package recursion;

public class Lab27 {
	/**
	 * Write a method which sums up each of the digits of the inputted 
	 * integer. 
	 * 
	 * Examples:
	 * If x is 234, the function should return 2 + 3 + 4, that is, 9.
	 * If x is 12, the function should return 1 + 2, which is 3. 
	 * If x is 39, the function should return 12. 
	 * @param in the input 
	 * @return the sum of the digits
	 */
	public static int sumDigits(int in) {
		if(in==0) return 0;
		return  sumDigits(in/10)+ in%10;
	}
	
	/**
	 * Write a method which reverses a string.
	 * 
	 * Example:
	 * reverseString("hello") -> olleh
	 * @param in the string to be reversed
	 * @return the reversed string
	 */
	public static String reverseString(String in) {
		if(in.isEmpty()) return in;
		return reverseString(in.substring(1))+ in.charAt(0);
	}
	
	/**
	 * Write a method which sums the integers 1 through n.
	 * 
	 * Example:
	 * sumIntegers(5) -> 1 + 2 + 3 + 4 + 5 -> 15
	 * @param n input number to be summed 
	 * @return the sum of the integers
	 */
	public static int sumIntegers(int n) {
		if(n==0) return 0;
		return sumIntegers(n-1)+ n;
	}
	
}
