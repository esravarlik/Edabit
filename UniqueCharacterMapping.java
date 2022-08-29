/* 
characterMapping("abcd") ➞ [0, 1, 2, 3]
characterMapping("abb") ➞ [0, 1, 1]
characterMapping("babbcb") ➞ [0, 1, 0, 0, 2, 0]
characterMapping("hmmmmm") ➞ [0, 1, 1, 1, 1, 1]
*/

//Solution;

import java.util.ArrayList;
public class Challenge {
	public static int[] characterMapping(String str) {
		ArrayList<Character> list = new ArrayList<>();
		char[] arr = str.toCharArray();
		int[] out = new int[str.length()];
    
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
				out[i] = list.indexOf(arr[i]);
			} else {
				out[i] = list.indexOf(arr[i]);
			}
		}
		return out;
	}
}
