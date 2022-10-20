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

public class Main {
    public static void main(String[] args) {
        System.out.println(printGridHorizontal(3,6));
        System.out.println(printGridVertical(3,6));
    }

    /*
    printGridHorizontal;
        1, 2, 3, 4, 5, 6
        7, 8, 9, 10, 11, 12
        13, 14, 15, 16, 17, 18
     */

    public static String printGridHorizontal(int rows, int cols) {
        String a = "";
        int col = 1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(j == cols-1){
                    a += col;
                    col++;
                }else{
                    a += col + ", ";
                    col++;
                }
            }
            a += "\n";
        }
        return a;
    }

    /*
    printGridVertical;
        1, 4, 7, 10, 13, 16
        2, 5, 8, 11, 14, 17
        3, 6, 9, 12, 15, 18
     */

    public static String printGridVertical(int rows, int cols) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= rows; i++) {
            for(int j = 0; j < cols; j++) {
                sb.append(i + j * rows);
                if (j == cols -1)
                    sb.append("\n");
                else
                    sb.append(", ");
            }
        }
        return sb.toString().trim();
    }
}
