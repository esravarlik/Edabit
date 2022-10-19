/*
Create a function that takes an array and finds the integer which appears an odd number of times.

findOdd([1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5]) ➞ -1
findOdd([20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5]) ➞ 5
findOdd([10]) ➞ 10
*/


//Solution;

public class Challenge {
	public static int findOdd(int[] arr) {
  int count = 0; 
   for (int i = 0; i < arr.length; i++) { 
   for (int j = 0; j < arr.length; j++) { 
   if (arr[i] == arr[j])  count++; 
    } 
      if (count % 2 != 0) 
        return arr[i]; 
    }
		return 0;
	}
}
