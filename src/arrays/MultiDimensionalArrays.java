package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println(arr.length);//It will print the no of rows

        //input
        for (int row = 0; row < arr.length; row++){
            //now to print col in the row
            for (int col=0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }
        }
//Output Type 1
//        for (int row = 0; row < arr.length; row++){
//            //now to print col in the row
//            for (int col=0; col < arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //Output Type 2
        for(int row =0; row< arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
