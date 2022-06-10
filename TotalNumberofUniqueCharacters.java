
countUnique("apple", "play") ➞ 5
// "appleplay" has 5 unique characters:
// "a", "e", "l", "p", "y"
countUnique("sore", "zebra") ➞ 7
countUnique("a", "soup") ➞ 5
  
  //Solution;
  public class Program {
	public static int countUnique(String s1, String s2) {
		return (int)(s1 + s2).chars()
			.distinct()
			.count();
	}
}
  
