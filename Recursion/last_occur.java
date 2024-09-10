package Recursion;

public class last_occur {

    public static int isLastOcuurence(int arr[] , int key ,int i ){

        if(i == arr.length){
            return -1;
        }

        int isFound = isLastOcuurence(arr, key, i + 1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,6,7,5};
        System.out.println(isLastOcuurence(arr, 5, 0));
    }
}
