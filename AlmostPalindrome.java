/* 
A string is an almost-palindrome if, by changing only one character, you can make it a palindrome. 
Create a function that returns true if a string is an almost-palindrome and false otherwise.

almostPalindrome("abcdcbg") ➞ true
// Transformed to "abcdcba" by changing "g" to "a".
almostPalindrome("abccia") ➞ true
// Transformed to "abccba" by changing "i" to "b".
almostPalindrome("abcdaaa") ➞ false
// Can't be transformed to a palindrome in exactly 1 turn.
almostPalindrome("1234312") ➞ false
*/

//Solution;

public class Challenge {
  public static boolean almostPalindrome(String str) {
		int diff = 0;
		for(int i=0; i<str.length()/2;i++){
			if(str.charAt(i) != str.charAt(str.length()-1-i)){
				diff++;
			}
		}
			if(diff > 1 || diff == 0)
				return false;
			else
				return true;
		}
}
