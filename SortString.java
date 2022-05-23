//Create a function that takes a string and returns true or false, depending on whether the characters are in order or not.

isInOrder("abc") ➞ true
isInOrder("edabit") ➞ false
isInOrder("123") ➞ true
isInOrder("xyzz") ➞ true

  
//Solution;

public class Program{
  public static boolean isInOrder(String str){
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != str.charAt(i)) {
				return false;
			}
		}
		return true;
  }
}


public class Program{
  public static boolean isInOrder(String s) {
		String[] r=s.split("");
		java.util.Arrays.sort(r);
		return String.join("", r).equals(s);
  }
}
