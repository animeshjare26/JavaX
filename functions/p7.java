package functions;


/*Check Prime Numbers in a given range */

public class p7 {
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


    public static void PrimesInRange(int n){

        for(int i = 2; i<= n;i++){
            if(isPrimeNo(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimesInRange(100);
    }

    
}
