/*
threeLetterCollection("tesha") ➞ ["esh", "sha", "tes"]
threeLetterCollection("click") ➞ ["cli", "ick", "lic"]
threeLetterCollection("cat") ➞ ["cat"]
threeLetterCollection("hi") ➞ []
threeLetterCollection("slap") ➞ ["lap", "sla"]
*/

//Solution;

public class LetterGroup {
	public static String[] threeLetterCollection(String s) {
		int l = s.length();
		String[] newString =new String[l<3 ? 0 : l-2];
		for (int i=0; i+2<l; i++)
			newString[i]=s.substring(i, i+3);
		java.util.Arrays.sort(newString);
		return newString;
	}
}
