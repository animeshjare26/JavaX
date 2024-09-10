package loops;

/* print sum of the given  series  : 1-2+3-4+5-6+7-8+9-...... */
import java.util.*;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            if(i % 2 == 0){
                sum-=i;
            }else{
                sum+=i;
            }
            
        }
        System.out.println("sum of numbers in series :" + sum);
    }
}
