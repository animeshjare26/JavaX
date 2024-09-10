package loops;

/*Sum  of each digit of  a given number */


import java.util.Scanner;


public class P7_digit {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int num = sc.nextInt();
    int sum = 0;
    while(num > 0){
        sum += num % 10;
        num = num / 10;
    }
    System.out.println("Sum of each digit :" +sum);

   }
    
}
