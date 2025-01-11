package programs.ifElseProblems;

import java.util.Scanner;

public class ageProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are not an adult!");
        }

        scanner.close();
    }
}
