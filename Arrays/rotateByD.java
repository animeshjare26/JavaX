package Arrays;

import java.lang.reflect.Array;
import java.lang.reflect.Array;
import java.util.Arrays;

public class rotateByD {

   public static void reverse(int nums[] , int start , int end){
        while(start<= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
   }
   public static int[] rotate(int nums[],int k ){
    int n  = nums.length;

    reverse(nums, 0, k-1);
    reverse(nums, k, n-1);
    reverse(nums, 0, n-1);

    return nums;
   }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int k = 3;

        rotate(nums, k);
        for(int i = 0 ;i < nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
