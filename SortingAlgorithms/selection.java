package SortingAlgorithms;
import java.util.*;
public class selection {

    public static void selectionSort(int arr[]){
        for(int i = 0;i< arr.length-1;i++){
            int min = i;
            for(int j = i+1 ;j< arr.length;j++){
                if(arr[min] < arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) { 
        int arr[] = {8,7,1,3,2,6,4};
        selectionSort(arr);
        // printArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
