package functions;

public class binomialCoe {

    public static int factorial(int num) {
        int fact = 1;
        for(int  i =  1;i<= num;i++){
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoe(int n, int r ) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n -r);
        int result = fact_n / (fact_r * fact_nmr);
        return  result;

    }

    public static void main(String[] args) {
        System.out.println(binomialCoe(4, 3));
    }
}
