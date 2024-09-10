package loops;

/* Write a program that reads a set of integers, and then prints the sum of the
even and odd integers. */

import java.util.*;

public class P13 {
    public static void main(String[] args) {
        int number;
        int evenNumber = 0;
        int oddNumber = 0;
        int choice;

        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number :");
             number = sc.nextInt();
            if(number % 2 == 0){
                evenNumber += number;
            }else{
                oddNumber += number;
            }
            System.out.println("Do u want to add more ?  then press 1 else 0 to exit");
            choice = sc.nextInt();

        }while(choice == 1);

        System.out.println("Even number sum :" + evenNumber);
        System.out.println("Odd number sum :" + oddNumber);
    }

    }
