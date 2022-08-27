/*
canBuild(["a", "at", "ate", "late", "plate", "plates"]) ➞ True

canBuild(["a", "at", "ate", "late", "plate", "plater", "platter"]) ➞ False
# "platter" is formed by adding "t" in the middle of "plater"

canBuild(["it", "bit", "bite", "biters"]) ➞ False
# "biters" is formed by adding two letters - we can only add one

*/

//Solution;

public class Challenge {
	public static boolean canBuild(String[] arr) {
		for(int i = 0; i < arr.length - 1; i++)
			if(arr[i+1].replace(arr[i], "").length() != 1)
				return false;
		return true;
	}
}
