package Arrays;

public class Pairs {
    public  static void pairs(int nums[]){
        int totalCount = 0;
        for(int i = 0;i<nums.length;i++){
            int curr = nums[i];
            for(int j = i+1;j<nums.length;j++){
                System.out.print("(" + nums[i] + ","+ nums[j] + ") ");
                totalCount++;
            }
            System.out.println();
        }
        System.out.println("totalCount : " + totalCount);
    }
    public static void main(String[] args) {
        int nums [] = {2,4,6,8,10};
        pairs(nums);

    }
}
