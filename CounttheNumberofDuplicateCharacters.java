/* 
Create a function that takes a string and returns the number of 
alphanumeric characters that occur more than once.

duplicateCount("abcde") ➞ 0
duplicateCount("aabbcde") ➞ 2
duplicateCount("Indivisibilities") ➞ 2
duplicateCount("Aa") ➞ 0
// Case sensitive

*/

//Solution;

public class Challenge {
  
	public static int duplicateCount(String str) {
		int count=0;
    
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j<str.length(); j++) {
        
				if(str.charAt(i)==str.charAt(j) && i!=j) {
					str=str.replaceAll(""+str.charAt(i),"");
					count++;
				}
			}
		}
		return count;
  }
}
