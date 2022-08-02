/*
Given any number, we can create a new number by adding the sums of squares of digits of that number. 
For example, given 203, our new number is 4 + 0 + 9 = 13. If we repeat this process, we get a sequence of numbers:

203 -> 13 -> 10 -> 1 -> 1
Sometimes, like with 203, the sequence reaches (and stays at) 1. Numbers like this are called happy.

Not all numbers are happy. If we started with 11, the sequence would be:

11 -> 2 -> 4 -> 16 -> ...
This sequence will never reach 1, and so the number 11 is called unhappy.

Given a positive whole number, you have to determine whether that number is happy or unhappy.

Examples
happy(203) ➞ true
happy(11) ➞ false
happy(107) ➞ false
*/

// Solution;
public class Challenge {
  public static boolean happy(int num) {
		while (num != 1 && num != 4) { num = sumSquares(num); }
		return num == 1;
  }
	
	public static int sumSquares(int num) {
		int sum = 0;
		while (num != 0) {
			sum += Math.pow(num % 10, 2);
			num /= 10;
		}
		return sum;
	}
}
