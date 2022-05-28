
accum("abcd") ➞ "A-Bb-Ccc-Dddd"
accum("RqaEzty") ➞ "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
accum("cwAt") ➞ "C-Ww-Aaa-Tttt"
  
  //Solution;
  
  public class Challenge {
	public static String accum(String str) {
    
		String[] array = str.split("");
		String output = "";
    
		for(int i = 0;i < array.length; i++){
			output += array[i].toUpperCase();
      
			for(int j = 0;j < i ; j++){
				output += array[i].toLowerCase();
			}
      
			if(i != array.length -1){
				output += "-";
			}
		}
		return output;
	}
}
