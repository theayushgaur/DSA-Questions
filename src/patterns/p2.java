package patterns;

public class p2 {
    public static void main(String[] args) {
        pattern2(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern4(5);
        System.out.println();
        pattern5(5);
        System.out.println();
        pattern6(5);
        System.out.println();
        pattern7(5);
        System.out.println();
        pattern8(5);
        System.out.println();
        pattern9(5);
        System.out.println();
        pattern10(4);
        System.out.println();
        pattern11(5);
        System.out.println();
        pattern12(5);
        System.out.println();
        pattern13(5);
        System.out.println();
        pattern14(5);
        System.out.println();
        pattern15(3);
        System.out.println();
        pattern16(5);
        System.out.println();
        pattern17(5);
        System.out.println();

    }
    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    static void pattern3(int n){

            for (int row = 1; row <=n ; row++) {
                for (int col = 1; col <= n+1-row  ; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

    }
    static void pattern4(int n){

        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= row  ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }

    }

    static void pattern5(int n){

        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <= n+1-row  ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


        System.out.println();}
    static void pattern6(int n){

        for (int row = 0; row <n ; row++) {
            //space
            for (int j = 0; j <n-row-1 ; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j <2*row+1 ; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j <n-row-1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void pattern7(int n){

        for (int row = 0; row <n ; row++) {
            //space
            for (int j = 0; j <row ; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j <2*n-2*row-1 ; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j <n-row ; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void pattern8(int n){

        for (int row = 1; row < 2*n-1 ; row++) {
            if(row<=n){
                for (int col = 1; col <= row; col++) {
                    System.out.print("*");
                }
            }else {
                for (int col = 1; col < 2*n-row; col++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }

    static void pattern9(int n){
        int start = 1;
        for (int row = 0; row <n ; row++) {
          if(row%2 == 0) start=1;
          else start=0;
            for (int col = 0; col <=row ; col++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }

    static void pattern10(int n) {

        for (int row = 1; row <=n ; row++) {
            //First
            for (int col = 1; col <=row; col++) {
                System.out.print(col);
            }
            //Space
            for (int col = 0; col < 2*n-2*row; col++) {
                System.out.print("*");
            }
            //Second
            for (int col = row; col >=1; col--) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {
        int num = 1;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }

    static void pattern12(int n) {

        for (int row = 1; row <=n ; row++) {
            for (char col = 'A'; col <'A'+ row ; col++) { //in computer A + 2 means two alphabets after A i.e C
                System.out.print(col + " ");

            }
            System.out.println();
        }
    }
    static void pattern13(int n) {

        for (int row = 0; row <n ; row++) {
            for (char col = 'A'; col<='A'+ (n - row - 1 )  ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    static void pattern14(int n) {

        for (int row = 0; row <n; row++) {

            for (int col = 0; col <= row; col++) {
                System.out.print((char)((int)('A'+row)) + " ");
            }
            System.out.println();

        }
    }

    static void pattern15(int n) {
        for (int row = 0; row < n; row++) {
            //space
            for (int col = 0; col <n-1-row ; col++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakPoint = (2*row+1)/2;
            for (int col = 1; col <= 2*row+1 ; col++) {
                System.out.print(ch+"");
                if(col<=breakPoint) ch++;
                else ch--;
            }
            //space
            for (int col = 0; col <n-1-row ; col++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void pattern16(int n) {
        for (int row = 0; row <n ; row++) {
            //stars
            for (int col = 0; col <n-row ; col++) {
                System.out.print("*");
            }
            //space
            for (int col = 0; col < 2* row; col++) {
                System.out.print(" ");
            }
            //star
            for (int col = 0; col <n-row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 0; row <n ; row++) {
            //stars
            for (int col = 0; col <row+1 ; col++) {
                System.out.print("*");
            }
            //space
            for (int col = 0; col <2*(n-row-1) ; col++) {
                System.out.print(" ");
            }
            //stars
            for (int col = 0; col <row+1 ; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
    static void pattern17(int n){
//        for (int row = 0; row <=2*n+1 ; row++) {
//            System.out.print("* ");
//        }
//        System.out.println();
        for (int row = 0; row <n ; row++) {
            //Star
            for (int col = 0; col < row+1; col++) {
                System.out.print("*");
            }
            //Space
            for (int col = 0; col <2*(n-row-1) ; col++) {
                System.out.print(" ");
            }
            //Star
            for (int col = 0; col < row+1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
