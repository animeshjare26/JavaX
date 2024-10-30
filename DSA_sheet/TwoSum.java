package DSA_sheet;

import java.util.*;
public class TwoSum {

    public static int[] bruteForce(int nums[] , int target){
        int n = nums.length;

        for(int i = 0 ;i < n ; i++){
            for(int j = i+1 ; j < n ; j ++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    } 
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(bruteForce(nums, target)));
    }
}
