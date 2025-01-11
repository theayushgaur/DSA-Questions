package patterns;

import java.util.Scanner;

public class p9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of lines ");
        int n = scanner.nextInt();
        for (int row = 0; row <= n; row++) {
            // Space
            for (int space = 0; space < n - row + 1; space++) {
                System.out.print(' ');
            }
            // Star
            for (int star = 0; star < 2 * row + 1; star++) {
                System.out.print('*');
            }
            for (int space = 0; space < n - row + 1; space++) {
                System.out.print(' ');
            }
            System.out.println();
        }
        scanner.close();
    }
}
/*
     *     
    ***    
   *****   
  *******  
 ********* 
 */