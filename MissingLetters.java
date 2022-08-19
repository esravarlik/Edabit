/* 
getMissing("abcdefgpqrstuvwxyz") ➞ "hijklmno"
getMissing("zyxwvutsrq") ➞ "abcdefghijklmnop"
getMissing("abc") ➞ "defghijklmnopqrstuvwxyz"
getMissing("abcdefghijklmnopqrstuvwxyz") ➞ ""
*/

//Solution;

import java.util.*;

public class MissingLetters {
	public static String getMissing(String str) {
		 String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
     List<String> list = new ArrayList<>();

     for (int j = 0; j <alphabet.length; j++) {
			 if(!str.contains(alphabet[j])){
				 list.add(alphabet[j]);
			 }
		 }
     String res = String.join("", list);
		return res;
	}
}
