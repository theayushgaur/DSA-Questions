package functions;

import java.util.Scanner;

public class function2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = input.next();
        String messagePrint = myGreet(name);
        System.out.println(messagePrint);

    }
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
}
