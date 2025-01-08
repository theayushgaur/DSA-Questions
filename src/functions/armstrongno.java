package functions;

import java.util.Scanner;

public class armstrongno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int no = input.nextInt();
//        System.out.println(isArmStrong(no));

        for (int i = 1; i<100; i++){
            if (isArmStrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;
     while (n>0){
         int remainder = n % 10;
         n = n/10;
        sum = sum + remainder*remainder*remainder;
     }
        return sum == original;
    }
}
