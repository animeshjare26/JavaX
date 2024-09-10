package AdvPatterns;

/*Program to print half Pyramid */

public class p2 {


    public static void halfPyramid(int n) {
        for(int i = 1;i<= n;i++){

            //for blank spaces 
            for(int j = 1;j<= n- i;j++){
                System.out.print(" ");
            }

            //for printing stars
            for(int j = 1;j<= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        halfPyramid(4);
    }
}

