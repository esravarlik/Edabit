
returnInts([9, 2, "space", "car", "lion", 16]) ➞ [9, 2, 16];
returnInts(["hello", 81, "basketball", 123, "fox"]) ➞ [81, 123];
returnInts([10, "121", 56, 20, "car", 3, "lion"]) ➞ [10, 56, 20, 3];
returnInts(["String",  true,  3.3,  1]) ➞ [1]



//Solution;

import java.util.*;

public class Program {
  public static int[] returnInts(Object[] arr) {
	  List<Integer> list = new ArrayList<>();
	  for(Object obj: arr){
		  if(obj instanceof Integer){
			  list.add((int) obj);
		  }
	  }
		
	  int[] intArr = new int[list.size()];
	  for(int i=0;i< list.size();i++){
		  intArr[i] = list.get(i);
	  }
	  return intArr;
  }
}


//Solution2;

import java.util.Arrays;
public class Program {
	public static int[] returnInts(Object[] arr) {
		return Arrays.stream(arr)
			.filter(o -> o instanceof Integer)
			.mapToInt(o -> (int) o)
			.toArray();
	}
}
