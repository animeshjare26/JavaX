package loops;

/*print reverse the digit of the number */

import java.util.Scanner;

public class P8_reverse {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    int num = n;
    int result =  0;

    while(n > 0){
        result = result * 10 + n % 10;
        n =n /10;

    }
    System.out.println("Reverse of " + num + " is :" + result);

   }
    
}
