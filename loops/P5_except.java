package loops;

/*Print  all the numbers from user except multiple of 2 */

import java.util.Scanner;
public class P5_except {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        for(int i = 0; i<=n;i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

        sc.close();;
    }
}
