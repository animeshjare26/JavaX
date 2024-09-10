package AdvPatterns;

import java.util.*;;

public class pascel {
    public static void pascel(int n) {
        for(int i =0 ;i<= n;i++){
            
            //blank spaces
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }

            int coefficient = 1;

            for(int j = 0;j<=i;j++){
                System.out.print(coefficient + " ");

                coefficient = coefficient * (i - j) / (j+1);;
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        pascel(4);
    }
}
