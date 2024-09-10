package functions;

public class fact {
    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n;i++){
           f *= i;
        }
        return f;
    }
    public static void main(String[] args) {
        int fact = factorial(8);
        System.out.println("Factorial" +" is :"+ fact);
    }
}
