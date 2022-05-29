zipIt([["Tesha", "Tesh", "Shang"], ["Deep", "Xavier", "Dex"]])
 ➞ [["Tesha", "Deep"],["Tesh", "Xavier"],["Shang", "Dex"]]

zipIt(["Elise", "Mary"], ["John", "Rick"])
 ➞ [["Elise", "John"], ["Mary", "Rick"]]

zipIt(["Ana", "Amy", "Lisa"], ["Bob", "Josh"]) ➞ null

zipIt(["Ana", "Amy", "Lisa"], ["Bob", "Josh", "Tim"])
 ➞ [["Ana", "Bob"], ["Amy", "Josh"],["Lisa", "Tim"]]
 
  //Solution;
  
  public class PairAndZip {
	public static String[][] zipIt(String[] women, String[] men) {
		if (women.length != men.length) {
			return null;
		}
		String[][] pairs = new String[women.length][2];
		for (int i = 0; i < women.length; i++) {
			pairs[i][0] = women[i];
			pairs[i][1] = men[i];
		}
		return pairs;
	}
}
