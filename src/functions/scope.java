package functions;

public class scope {
    public static void main(String[] args) {
        int a = 10; //Initialization of a
        int b = 20; //Initialization of b
        {  //Another block inside the method Starts

//            int a = 78; this will throw error because the a is already initialized in the method above
            a = 30; // But yes it can be modified
            int c = 99;

            //so values initialised in this block will remain in this bock only
        }  //Another block inside the method ends
//        System.out.println(c); this will throw error as the c is initialized in the above block not in the main block
    }
}
//In this way we understand the concept of the scope
// Anything initialized outside the block can be used inside the block
// But Anything initialized inside the block cannot be used outside the clock.
//You can modify variables according to your needs anywhere but can't initialise them everywhere
