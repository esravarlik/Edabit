/*
2  4  6  +
3  1  7  =
--------
3  4  7

// 3 > 2 | 4 > 1 | 7 > 6

   2  0  +
1  4  0  =
-------
1  4  0

// 1 > 0 | 4 > 2 | 0 == 0
*/

//Solution;

public class Challenge {
	public static int lunarSum(int n, int m) {
		String s = "";
		while(n > 0 || m > 0){
			s += String.valueOf(Math.max(n % 10, m % 10));
			n /= 10;
			m /= 10;
		}
		return Integer.parseInt(s);
  }
}
