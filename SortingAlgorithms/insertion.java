package SortingAlgorithms;

public class insertion {

    public static void insertionSort(int arr[]){

        for(int i = 1;i< arr.length;i++){
            int curr = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > curr) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =curr;
        }
    }

    public static void printArr(int arr[]){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {6,1,3,2,4,5};
        insertionSort(arr);
        printArr(arr);
    }
    
}
