package loops;

/* print sum of n numbers */


import java.util.*;

public class P3_sum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =1;i<= n;i++){
            sum +=i;
        }
        System.out.println("Sum of n natural numbers is : "+ sum);
         
    }
}
