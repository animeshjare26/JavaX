package Recursion;


public class optimizedPower {
    
    public static int optimizedPower(int a ,int n) {
        
        //Base Case 
        if(n==0){
            return 1 ;
        }
        // int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2);
        int halfPower = optimizedPower(a, n/2);

        int halfPowerSq = halfPower * halfPower;
        //if n is odd
        if(n % 2 != 0){
            return halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;

    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 5));
    }
}
