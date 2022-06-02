censor("The code is fourty") ➞ "The code is ******"
censor("Two plus three is five") ➞ "Two plus ***** is five"
censor("aaaa aaaaa 1234 12345") ➞ "aaaa ***** 1234 *****"
  
  //Solution;
  
  public class Challenge {
    
	public static String censor(String str) {
		String censored = "";
    
		for(String s : str.split(" ")){
      
			if(s.length() > 4){
				censored += s.replaceAll("[^ ]","*");
			}else{
				censored += s;
			}
			censored += " ";
		}
		return censored.trim();
	}
}
