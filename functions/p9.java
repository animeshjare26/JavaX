package functions;

import java.util.Scanner;

public class p9 {
    public static int decToBin(int decimal){
        int binary = 0;
        int power = 0;
        
        while(decimal != 0){
            int rem = decimal % 2;
            binary = binary + (rem *(int) Math.pow(10, power));
            decimal = decimal / 2;
            power++;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        int convert = decToBin(n);
        System.out.println("Decimal to binary converison of "+n+" is :"+ convert);
    }

}
