package patterns;

public class p7 {
    public static void main(String[] args) {
        for (int row = 0; row <= 4; row++) {
            for (int column = 0; column < 4 - row + 1; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
 * * * * *
 * * * *
 * * *
 * *
 * 
 */