package Arrays;

public class subArray {

    public static void printSubarrays(int nums[]){
        int totalCount = 0;

        for(int i = 0;i< nums.length;i++){
            for(int j = i;j< nums.length;j++){
                
                for(int k = i;k<=j;k++){ //prints
                    System.out.print(nums[k] + " ");
                    
                }
                System.out.println();
                totalCount++;
            }
            System.out.println();
        }
        System.out.println("totalCount : " + totalCount);
    }
    public static void main(String[] args) {
        int nums []= {2,4,6,8,10};
        printSubarrays(nums);
    }
}
 