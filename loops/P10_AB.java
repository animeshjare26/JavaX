package loops;

/*Find a raise to the power b  / a^b  */

import java.util.Scanner;

public class P10_AB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b :");
        int b = sc.nextInt();
        int fact = 1;
        for(int i = 1;i<b;i++){
            fact *= a;
        }
        System.out.println("a raise to b is :" + fact);
        sc.close();



        
    }
    
}
