package Recursion;


public class fibonacci {

    public static int fibonacci(int n) {
        
        //Base Case
        if(n == 0 || n == 1){
            return n;
        }

        int fibo_nm1 = fibonacci(n - 1);
        int fibo_nm2 = fibonacci(n -2);
        int fibo_n = fibo_nm1 + fibo_nm2;

        return fibo_n;
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.print(fibonacci(n));
    }
}
