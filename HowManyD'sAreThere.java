//Create a function that counts how many D's are in a sentence.
/*
countDs("My friend Dylan got distracted in school.") ➞ 4
countDs("Debris was scattered all over the yard.") ➞ 3
countDs("The rodents hibernated in their den.") ➞ 3
*/

//Solution;

public class FourthLetter {
	public static int countDs(String s) {
		return s.replaceAll("[^dD]","").length();
	}
}

//Solution2;

public class FourthLetter {
	public static int countDs(String s) {
		int count = 0;
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == 'd' || s.charAt(i) =='D') count++;
		}		
		return count;
	}
}

