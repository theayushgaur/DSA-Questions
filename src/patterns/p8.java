package patterns;

public class p8 {
    public static void main(String[] args) {
        for (int row = 0; row <= 4; row++) {
            for (int column = 1; column < 5 - row + 1; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */