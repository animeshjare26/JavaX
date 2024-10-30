package DSA_sheet;

import java.util.*;

public class SortArrayBY012 {

    static void betterSolution(int arr[]){
        int cnt0 = 0 , cnt1 = 0 , cnt2 = 0;

        for(int i = 0;i < arr.length;i++){
            if(arr[i] == 0){
                cnt0++;
            }else if(arr[i] == 1){
                cnt1++;
            }else{
                cnt2++;
            }
        }
        for(int i =0;i< cnt0;i++){
            arr[i] = 0;
        }
        for(int i =cnt0;i< cnt0 + cnt1;i++){
            arr[i] = 1;
        }
        for(int i =cnt0 +cnt1;i<arr.length;i++){
            arr[i] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }

    static void optimalSolution(int arr[]){
        
        int low = 0, mid = 0,high = arr.length -1;

        while(mid <= high){

            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid]= arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {0,1,2,0,1,2,1,2,1,2,0,0,0,1};

        // betterSolution(arr);
        optimalSolution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
