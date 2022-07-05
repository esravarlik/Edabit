/*
Given a string, return if a given letter always appears immediately before another given letter.
bestFriend("tesha has a pretty and a happy face", "h", "a") ➞ true
// all occurences of "h": ["tesha", "has", "happy"]
// all occurences of "h" have an "a" after it.
// return true

bestFriend("i found an ounce with my hound", "o", "u") ➞ true
bestFriend("we found your dynamite", "d", "y") ➞ false
bestFriend("tesh loves my messages", "e", "s") ➞ true
*/

//Solution;
public class LetterFrom {
  public static boolean bestFriend(String s, String a, String b) {
	 s = s.replaceAll(a+b+"+", "");
   return !s.contains(a)&&!a.equals(b);
	}
}


//Solution;
public class LetterFrom {
  public static boolean bestFriend(String s, String a, String b) {
		for (int i=1; i<=s.length(); i++)
			if (s.substring(i-1,i).equals(a))
				if (i==s.length() || !s.substring(i,i+1).equals(b))
					return 1>2;
		return 1<2;
	}
}
