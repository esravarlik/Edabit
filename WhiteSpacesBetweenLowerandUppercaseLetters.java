/*
insertWhitespace("SheWalksToTheBeach") ➞ "She Walks To The Beach"
insertWhitespace("MarvinTalksTooMuch") ➞ "Marvin Talks Too Much"
insertWhitespace("TheGreatestUpsetInHistory") ➞ "The Greatest Upset In History"
*/



//Solution;

public class Challenge {
	public static String insertWhitespace(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length();i++){
      //i>0 Cumlenin bas harfi icin bosluk olmamali
			if(i>0 && Character.isUpperCase(s.charAt(i))){
				sb.append(" ");
			}
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
}
