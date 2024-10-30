package DSA_sheet;


//Give an array of integers ,return an array with even integers  removed.

public class Q1 {
    public static void main(String[] args) {
        int arr[] = {3,2,4,7,10,6,5};
        int count = 0;

        for(int i = 0;i< arr.length;i++){
            if(arr[i] % 2 != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        for(int i = 0;i< count;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
