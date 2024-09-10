package DSA_sheet;

public class duplicateElement {

    public static int removeDuplicate(int nums[]) {
        int count = 0;
        for(int i = 0;i< nums.length;i++){
            if(i < nums.length - 1 && nums[i] == nums[i+1]){
                continue;
            }else{
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int nums [] = {1,1,2,2,3,3,4};
        System.out.println("total unique elements in nums are : " + removeDuplicate(nums));
    }
}
