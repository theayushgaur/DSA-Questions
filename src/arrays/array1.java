package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] =987;
        arr[2] =765;
        arr[3] =233;
        arr[4] =455;
//        System.out.println(arr[3]);

        //Taking the input using the for Loop

        for (int i=0; i< arr.length; i++){
            arr[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(arr)); //Way 1 to print the array
//        for (int i=0; i< arr.length; i++){    //Way 2 to print array
//            System.out.print(arr[i] + " ");
//            }
    }
}
