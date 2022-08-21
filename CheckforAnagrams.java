/* 
isAnagram("cristian", "Cristina") ➞ true
isAnagram("Dave Barry", "Ray Adverb") ➞ true
isAnagram("Nope", "Note") ➞ false
*/

//Solution;

import java.util.Arrays;
public class Program {
    public static boolean isAnagram(String s1, String s2) {
	      String[] array1 = s1.toLowerCase().split("");
	      Arrays.sort(array1);
	      
	      String[] array2 = s2.toLowerCase().split("");
	      Arrays.sort(array2);
	      
	      return Arrays.equals(array1, array2);
	      
    }
}
