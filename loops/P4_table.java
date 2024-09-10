package loops;

/*Print table of a number */
import java.util.*;
public class P4_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number :");
        int n = sc.nextInt();

        for(int i = 1;i<= 10;i++){
            int result = n * i;
            System.out.println(n + " x "+i +" = "+ result);
        }
    }
}
