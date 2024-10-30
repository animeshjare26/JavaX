package Arrays;

public class subArray {

    public static  void printSubarrays(int nums[]){

        int count = 0;
        for(int  i =0;i< nums.length;i++){
            for(int j = i;j< nums.length;j++){

                for(int k = i;k<=j;k++){
                    System.out.print(nums[k] + " ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays :" + count);
    }
    public static void main(String[] args) {
        int nums []= {2,4,6,8,10};
        printSubarrays(nums);
    }
}
 