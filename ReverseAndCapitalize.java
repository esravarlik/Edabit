/*
reverseCapitalize("abc") ➞ "CBA"
reverseCapitalize("hellothere") ➞ "EREHTOLLEH"
reverseCapitalize("input") ➞ "TUPNI"
*/

public class Challenge {
	public static String reverseCapitalize(String str) {
		return new StringBuilder(str).reverse().toString().toUpperCase();
	}
}
