package Recursion;

 
public class occerence {
    
    public static int firstOccurence(int arr[] , int key , int i) {
        
        //Base Case
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return firstOccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr [] = {1,2,8,6,9,45};
        System.out.println(firstOccurence(arr,6  , 0));
    }
}
