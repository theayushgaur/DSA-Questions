package programs.ifElseProblems;

import java.util.Scanner;

public class gradingProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();
        if (marks < 25) {
            System.out.println('F');
        } else if (marks <= 44) {
            System.out.println('E');
        } else if (marks <= 49) {
            System.out.println('D');
        } else if (marks <= 59) {
            System.out.println('C');
        } else if (marks <= 79) {
            System.out.println('B');
        } else if (marks < 100) {
            System.out.println('A');
        } else if (marks == 100) {
            System.out.println("A+");
        }

        scanner.close();
    }
}
