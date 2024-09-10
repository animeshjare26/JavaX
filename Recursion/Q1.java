package Recursion;


public class Q1 {
    public static void occurrence(int arr[] ,int key,int i) {
        
        if(i== arr.length){
            return;
        }

        if(arr[i] == key){
            System.out.print(i+ " ");
        }

        occurrence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,6,1,4,2,7,2,2,9,5,7};
        int key = 2;
        occurrence(arr, key, 0);
        System.out.println();
    }
}
