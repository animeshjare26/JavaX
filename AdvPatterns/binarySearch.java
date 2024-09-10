package arrays;

public class LinearSearch {
    public static void printPascal(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int coefficient = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(coefficient + " ");
                coefficient = coefficient * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPascal(6); // Change the argument to specify the number of rows
    }
}
