package SortingAlgorithms;

public class bubble {

    public static void bubbleSort(int arr[]){

        for(int i =0; i < arr.length - 1;i++){
            //if array is  already sorted ?
            int swap = 0;
            for(int j = 0; j < arr.length - 1 - i ; j++){

                //swap
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]  = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }

            //check if swap is increasing or not , if not then array is already sorted 
            if (swap == 0) {
                // System.out.println("Already sorted !");
                break;
            }
        }
    }

    public static  void printArr(int arr[]){
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[] = {8,1,4,3,6,7,2,5};
        // int arr[] = {1,2,3,4,5,6,7,8};
        bubbleSort(arr);
        printArr(arr);
    }
        
}
