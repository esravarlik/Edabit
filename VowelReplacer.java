/*
replaceVowels("the aardvark", '#') ➞ "th# ##rdv#rk"
replaceVowels("minnie mouse", '?') ➞ "m?nn?? m??s?"
replaceVowels("shakespeare", '*') ➞ "sh*k*sp**r*"
*/

//Solution;

public class Challenge {
	public static String replaceVowels(String str, char ch) {
		return str.replaceAll( "[aeiou]", String.valueOf(ch));
	}
}
