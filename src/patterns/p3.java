package patterns;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of lines ");
        int star = scanner.nextInt();
        for (int row = 0; row < star; row++) {
            for (int column = 0; column < star; column++) {
                System.out.print('*');
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
 ****
 ****
 ****
 ****
 */