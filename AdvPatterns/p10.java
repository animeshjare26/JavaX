package AdvPatterns;

public class p10 {

    public static void numberPyramid(int n) {
        
        for(int i =1; i<= n;i++){

            //for starting spaces

            for(int j = 1; j<= 2*(n-i);j++){
                System.out.print(" ");
            }

            //for acending numbers

            for(int j =1;j<=i;j++){
                System.out.print(j+" ");
            }

            //for descending numbers 

            for(int j =i -1;j>=1;j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberPyramid(5);
    }
}

    
    
