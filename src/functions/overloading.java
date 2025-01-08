package functions;

public class overloading {
    public static void main(String[] args) {
        fun(12);
        fun("Ayush");

    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);

    }
}
// The two functions with same name but with different arguments this stage is called function overloading.