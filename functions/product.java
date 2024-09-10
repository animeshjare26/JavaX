package functions;

public class product {
    public static int multiply(int a ,int b){
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 25;
        int b = 5;
        int cross = multiply(a,b);
        System.out.println("a * b is :"+ cross);
        
        cross = multiply(100,55); 
        System.out.println("a * b is :"+ cross);
    }

    }

