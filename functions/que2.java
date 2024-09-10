package functions;

import java.util.Scanner;

public class que2 {

    public static boolean isEven(int n){
        if(n % 2 ==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        boolean check = isEven(num);
        if(check == true){
            System.out.println(num +" is Even");
        }else{
            System.out.println(num +" is Odd");
        }
        sc.close();
    }
}
