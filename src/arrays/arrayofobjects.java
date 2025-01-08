package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrayofobjects {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[4]; //Left side is Declairation and in compile time and On the Right sie initialization and on the run time
        for (int i = 0; i< str.length; i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
