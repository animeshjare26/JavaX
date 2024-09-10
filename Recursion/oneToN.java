package Recursion;

public class oneToN {

    public static void printInc(int n) {
        //Base Case
        if(n == 0){
            return;
        }

        printInc(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printInc(n);
    }
}
