package programs.ifElseProblems;

import java.util.Scanner;

public class nestedIfElseProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Not Eligible for the job");
        } else if (age <= 54) {
            System.out.println("Eligible for the job");
        } else if (age <= 57) {
            System.out.println("Eligible for the job, but retirement soon");
        } else if (age > 57) {
            System.out.println("retirement time");
        }
        scanner.close();
    }
}
