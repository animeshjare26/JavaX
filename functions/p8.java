package functions;

import java.util.Scanner;

public class p8 {
     public static int binaryToDec(int binary) {
        int decimal = 0;
        int power = 0;
        
        while(binary > 0){
           int lastDigit = binary % 10;
           decimal = decimal + (lastDigit * (int)Math.pow(2,power));
           binary = binary /10;
           power++;
        }
        return decimal;


     }

    public static void main(String[] args) {
        System.out.println(binaryToDec(100));
    }

}
