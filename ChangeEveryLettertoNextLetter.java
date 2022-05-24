/*
Write a function that changes every letter to the next letter:
"a" becomes "b"
"b" becomes "c"
*/

move("hello") ➞ "ifmmp"
move("bye") ➞ "czf"
move("welcome") ➞ "xfmdpnf"
  
//Solution;
  
 public class Challenge {
	public static String move(String word) {
	
		String result = "";
		for(int i=0;i<word.length();i++){
			char newLetter = word.charAt(i);
			newLetter += 1;
			result += newLetter; 
		}
		return result;
	}
}
