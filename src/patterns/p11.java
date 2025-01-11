package patterns;

import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of lines ");
        int n = scanner.nextInt();

        for (int row = 1; row <= 2 * n - 1; row++) {
            int stars = row;
            if (row > n)
                stars = (2 * n - row);

            for (int column = 1; column <= stars; column++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
/*
*
**
***
****
*****
****
***
**
*
 */
