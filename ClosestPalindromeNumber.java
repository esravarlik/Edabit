/*
Write a function that returns the closest palindrome number to an integer. 
If two palindrome numbers tie in absolute distance, return the smaller number.

closestPalindrome(887) ➞ 888
closestPalindrome(100) ➞ 99
// 99 and 101 are equally distant, so we return the smaller palindrome.
closestPalindrome(888) ➞ 888

*/

public class Challenge {
	public static long closestPalindrome(long num) {
		if (isPalindrome(num)){
			return num;
		}
		for (long i = num + 1, j = num - 1; true; i++, j--) {
			if(isPalindrome(j)) {
				return j;
			}
			if(isPalindrome(i)) {
				return i;
			}
		}
	}
	
	public static boolean isPalindrome(long num) {
		String number = String.valueOf(num);
		int k = number.length() - 1;
		for (int i = 0, j = k; i < j; i++, j--) {
			if(number.charAt(i) != number.charAt(j)) {
				return false;
			}
		}
		return true;
	}
}
