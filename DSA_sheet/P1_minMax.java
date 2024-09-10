package DSA_sheet;

public class P1_minMax {

    public static int fimdSum(int A[], int num) {

        int largeNo = Integer.MIN_VALUE; // - infinity
        int smallestNo = Integer.MAX_VALUE; // + infinity

        for (int i = 0; i < A.length; i++) {

            if (largeNo < A[i]) {
                largeNo = A[i];
            }

            if (smallestNo > A[i]) {
                smallestNo = A[i];
            }

        }
        int sum = largeNo + smallestNo;

        return sum;
    }

    public static void main(String[] args) {
        int A[] = { 1, 3, 4, 6, 1 };

        System.out.println(fimdSum(A, 5));
    }
}
