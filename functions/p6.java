package functions;

/* Check whether a number is prime or not */

public class p6 {
    public static boolean isPrimeNo(int num) {

        if (num == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(isPrimeNo(4));
    }

}
