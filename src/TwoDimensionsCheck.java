import java.util.List;
import java.util.Scanner;

public class TwoDimensionsCheck {

    public static void main(String[] args) {

        System.out.println("Hello Yandong!");
        int[][] arr = new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        boolean found = checkNum(arr,4,4,7);
        System.out.print(found);

    }

    public static boolean checkNum(int[][] arr,int rows, int columns, int number) {
        System.out.print("arr is :"+ arr.toString());
        boolean found = false;
        if(arr != null && rows > 0 && columns > 0) {
            int row = 0;
            int column = columns - 1;
            while ( row < rows && column >= 0 ) {
                if(arr[row][column] == number) {
                    found = true;
                    break;
                }
                else if( arr[row][column] > number ) {
                    --column;
                }
                else {
                    ++row;
                }
            }
        }
        return found;
    }
}
