package functions;


/* Function Over-riding with multiple parameteres*/

public class mthdoveriding {
    public static int sum(int a ,int b ){
        return a + b;
    }

    public static int  sum(int a ,int b , int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,6));
        System.out.println(sum(5,3,3));
    }
}
