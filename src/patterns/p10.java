package patterns;

import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of lines ");
        int n = scanner.nextInt();
        for (int row = 0; row <= n; row++) {
            for (int space = 0; space < row; space++) {
                System.out.print(' ');
            }
            for (int star = 0; star < 9 - 2 * row; star++) {
                System.out.print('*');
            }
            for (int space = 0; space < row; space++) {
                System.out.print(' ');
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
*********
 ******* 
  *****  
   ***   
    *   
 */