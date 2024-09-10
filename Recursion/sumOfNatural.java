package Recursion;

public class sumOfNatural {

    public static int sum(int n) {

        if(n == 1){
            return 1;
        }
        int snm1 = sum(n - 1);
        int sn = n + snm1;

        return sn;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.print(sum(n));
    }
}
