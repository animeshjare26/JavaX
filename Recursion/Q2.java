package Recursion;

import java.util.*;
public class Q2 {
    
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    public static void PrintNumbers(int number) {
        if(number == 0){
            return;
        }

        int lastDigit = number % 10;
        PrintNumbers(number/10);
        System.out.print(digits[lastDigit] +" ");
    }

    public static void main(String[] args) {
        PrintNumbers(9879);
    }
}
