package DSA_sheet;

public class serachInsert {

    public static int serachInsert(int nums[] ,int target) {
        int start = 0;
        int end = nums.length -1;

        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] > target){
                end = mid -1;
            }else{
                start = mid +1;
            }
        }
        return start;

        
    }
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = -1;

        System.out.println(serachInsert(nums, target));
    }
}
