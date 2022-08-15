/* 
printGrid(3, 6) ➞ "
  1, 4, 7, 10, 13, 16
  2, 5, 8, 11, 14, 17
  3, 6, 9, 12, 15, 18
"

printGrid(5, 3) ➞ "
  1, 6, 11
  2, 7, 12
  3, 8, 13
  4, 9, 14
  5, 10, 15
"
*/

//Solution;

public class Challenge {
	public static String printGrid(int rows, int cols) {
		StringBuilder grid = new StringBuilder();
		for (int i = 0; i < rows; i++) {
			int n = i + 1;
			for (int j = 0; j < cols - 1; j++) {
				grid.append(n + ", ");
				n += rows;
			}
			grid.append(n + "\n");
		}

		return grid.toString().trim();
	}
}
