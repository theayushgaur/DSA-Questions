package arrays;

import java.util.Arrays;

public class Passing {
    public static void main(String[] args) {
        int[] nums = {4, 5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] =99;
    }
}
