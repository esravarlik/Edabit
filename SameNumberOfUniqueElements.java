//Problem;
// Write a function that returns true if two arrays have the same number of unique elements, and false otherwise.

arr1 = [1, 3, 4, 4, 4];
arr2 = [2, 5, 7];

same([1, 3, 4, 4, 4], [2, 5, 7]) ➞ true
same([9, 8, 7, 6], [4, 4, 3, 1]) ➞ false
same([2], [3, 3, 3, 3, 3]) ➞ true
  
  
//Solution;
  
import java.util.HashSet;
import java.util.Set;

public class Challenge {
	  public static Set<Integer> dedupe(int[] arr) {
			Set<Integer> set = new HashSet<Integer>();
			for (int i : arr) {
				set.add(i);
			}
			
			return set;
		}
	
    public static boolean same(int[] a1, int[] a2) {
			return dedupe(a1).size() == dedupe(a2).size();
		}
}
