package loops;

/*check whether a number is prime or not */

import java.util.*;

public class P12_Prime {
    public static void  main (String arrgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();

        boolean isPrime = true;

        if(num == 2 ){
            System.out.println("2 is a even prime number ");
        }else{
            for(int i = 2;i<=Math.sqrt(num);i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("Prime number ");
        }else{
            System.out.println("not a prime");
        }

    }
}
 