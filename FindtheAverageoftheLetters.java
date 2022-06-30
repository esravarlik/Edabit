/*
A = 1
B = 2
C = 3
D = 4
E = 5

average = total sum of all numbers / number of item in the set

averageIndex(["f", "o", "r", "t", "h", "e", "l", "o", "v", "e", "o", "f", "t", "e", "s", "h"]) ➞ 12.44
averageIndex(["m", "y", "t", "e", "s", "h"]) ➞ 15.0
averageIndex(["m", "y", "w", "o", "r", "l", "d"]) ➞ 15.71
averageIndex(["y", "o", "u", "a", "r", "e", "t", "h", "e", "b", "e", "s", "t"]) ➞ 12.62

*/

public class LetterAverage {
  public static double averageIndex(String[] arr) {
		double total = 0;
		for (String s:arr)
			total+=s.charAt(0)-96;
		return total/arr.length;
  }
}

//OR

return Math.round(Stream.of(c).mapToInt(i ->i.charAt(0)-96).average().getAsDouble()*100)/100.0;
