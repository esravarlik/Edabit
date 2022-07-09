/*
A "magic square" is a square divided into smaller squares each containing a number,
such that the numbers in each vertical, horizontal, and diagonal row add up to the same value.

isMagicSquare([
  [8, 1, 6],
  [3, 5, 7],
  [4, 9, 2]
]) ➞ true

isMagicSquare([
  [16,  3,  2, 13],
  [ 5, 10, 11,  8],
  [ 9,  6,  7, 12],
  [ 4, 15, 14,  1]
]) ➞ true

*/

//Solution;

public class Challenge {
  public static boolean isMagicSquare(int[][] square) {		
		int totHoriz = 0;
		int totVert = 0;
		int totDiag = 0;
		
		for(int i = 0; i < square.length; i++){
			totHoriz += square[0][i];
			totVert += square[i][0];
			totDiag += square[i][i];
		}
		
		return (totHoriz == totVert) && (totHoriz == totDiag);
  }
}
