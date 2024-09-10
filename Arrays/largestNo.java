package Arrays;

import java.util.*;

public class largestNo {

    public static int largeNo(int numbers[]) {
        
        int largestNo = Integer.MIN_VALUE; // -infinity
        int smallestNo = Integer.MAX_VALUE; // + infinity

        for(int i = 0;i < numbers.length;i++){
            if(largestNo < numbers[i]){
                largestNo = numbers[i];
            }

            if(smallestNo > numbers[i]){
                smallestNo = numbers[i];
            }
        }
        System.out.println("Smallest number in array is :" + smallestNo);
        return largestNo;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 9, 55, 1, 99, 75, 66, 25, 134, 818 };
        int largeNumber = largeNo(numbers);
        
        System.out.println("largest numner in array is :" + largeNumber);
    }
}
