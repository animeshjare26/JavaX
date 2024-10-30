package Arrays;

public class TrappedRainwater {
    
    // static int trappedRainwater(int height[]){

    //     int n  = height.length;

    //     //calculate left max boundary
    //     int leftMax[] = new int[n];
    //     leftMax[0] = height[0];

    //     for(int i = 1;i < n;i++){
    //         leftMax[i] = Math.max(leftMax[i-1], height[i]);
    //     }
    //     for(int i = 0;i< leftMax.length;i++){
    //         System.out.print(leftMax[i] +" ");
    //     }
    //     System.out.println();

    
    //     //calculate right max boundary
    //     int rightMax[] = new int[n];
    //     rightMax[n-1] = height[n-1];

    //     for(int i = n-2 ; i >= 0;i--){
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //     }

    //     for(int i = 0;i< rightMax.length;i++){
    //         System.out.print( rightMax[i] + " ");
    //     }
    //     System.out.println();

    //     //loop
    //     int trappedWater = 0;
    //     for(int i  =  0;i< n ; i++){
    //         int waterLevel = Math.min(leftMax[i], rightMax[i]);
    //         trappedWater += waterLevel - height[i];
    //     }

    //     return trappedWater;
    //     //waterLevel = min(leftMax boundary, rightMax boundary)
    //     //trappedWater = waterLevel - height[i]
    // }
    
    static int trappedRainwater(int height[]){

        int n  = height.length;
        //left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n;i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //rightMax boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n -1];

        for(int i =n -2;i >= 0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //waterlevel

        int trappedWater = 0;

        for(int i = 0;i < n;i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;


    }
    public static void main(String[] args) {
        
        int height[] = {4,2,0,6,3,2,5};
        trappedRainwater(height);
        System.out.println(trappedRainwater(height));
    }
}
