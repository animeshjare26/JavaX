package functions;

import java.util.Scanner;

public class que3 {
    public static boolean isPalindrome(int n){
        int palindrome = n;
        int rev = 0;

        while( n != 0){
            rev = rev + n % 10;
            n = n /10;

        }
        if(palindrome == rev){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        boolean check = isPalindrome(num);

        if(check == true){
            System.out.println(num + " is a palindrome");
        }else{
            System.out.println(num + " is not a palindrome");
        }
        sc.close();
    }
}