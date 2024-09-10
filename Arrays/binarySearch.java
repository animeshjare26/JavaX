package Arrays;


public class binarySearch {

    public static int binarySearch(int arr[] ,int key) {
        int start = 0; 
        int end = arr.length -1;

        while(start <= end){
            int mid = (start + end)/2;

            if(arr[mid] == key){
                return mid;
            }

            if(arr[mid] < key){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

   public static void main(String[] args) {
    int arr [] = {1,3,5,8,10,88,98};
    int key = 10;

    int index = binarySearch(arr, key);
    System.out.println("key found at " + index);
   }
}
