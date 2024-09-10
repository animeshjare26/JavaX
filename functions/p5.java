package functions;


/*Function Overloading with different data types */

public class p5 {
    public static int sum(int a , int b) {
        return a + b;
    }

    public static float sum(float a , float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(8,8));
        System.out.println(sum(8f, 8f));
    }
}
