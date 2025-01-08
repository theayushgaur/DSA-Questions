package functions;

public class function1 {
    public static void main(String[] args) {
        int answer = sum(20,50);

        System.out.println("So the answer of the addition is : " + answer);
    }
    static int sum(int a , int b){//these are called the constructors
        int sum = a + b;
        return sum;
    }
}
