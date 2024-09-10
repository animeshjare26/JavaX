package functions;

import java.util.Scanner;

public class p1 {
    public static void helloWorld() {
        System.out.println("Hello World !");
        
    }
    public static int sum(int num1 ,int num2) {
        int sum = num1 + num2;
        return sum;  
    }
    public static void main(String[] args) {
        helloWorld();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a,b);
        System.out.println("sum is :" + sum);
        sc.close( );    
        
    }
}   
  