package loops;

/*print 1 to n numbers*/
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        while(count <= n){
            System.out.println(count);
            count++;
        }
        sc.close();
    }
    
}
