package Arrays;

public class maxSubArray {
    //brute force appproach
    public static void bruteForce(int arr[]){
        
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0;i< arr.length;i++){
            for(int j = i;j< arr.length;j++){
                currSum = 0;

                for(int k = i;k<=j;k++){
                    currSum += arr[k];
                }
                System.out.print(currSum +" \n");
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum :" + maxSum);
    }
    
    static void betterSoln(int arr[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1;i< prefix.length;i++){
            prefix[i] = prefix[i-1]  + arr[i]; 
        }

        for(int i = 0;i< arr.length;i++){
            int start = i;
            for(int j = i;j< arr.length;j++){
                int end = j;
                currSum = start == 0 ? prefix[end] :  prefix[end] - prefix[start-1];
            }
            System.out.println("currSum : " + currSum);
            maxSum =Math.max(currSum, maxSum);
        }
        System.out.println("maxSum : " + maxSum);
    }


    static int kandane(int arr[]){

        int cs = 0, ms = Integer.MIN_VALUE;
        int maxElem = Integer.MIN_VALUE;

        for(int i= 0;i< arr.length;i++){

            cs  = cs + arr[i];
            maxElem = Math.max(maxElem, arr[i]);

            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        return (ms == 0) ? maxElem : ms;
    }
    public static void main(String[] args) {
        // int arr[] = {1,-2,6,-1,3};
        int arr[]= {-1,-2,-3,-4,-5};
        // bruteForce(arr);
        // betterSoln(arr);
        kandane(arr);
        System.out.println(kandane(arr));
    }
    
}
