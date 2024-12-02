package DSA_sheet;

public class PascalTriangle {
    
    //if R n C given and we have to find out the place of element on R =5 , C = 3  i.e 6;
    static int bruteForce(int r ,int c){
        int res = 1;

        for(int i = 0;i < c; i++){
            res = res * (r-i);
            res = res / (i+1);
        }
        return res;
    }

    public static void main(String[] args) {
        int rows = 5;

        // for(int c = 1;c <=r;c++){
        //     System.out.print(bruteForce(r-1, c-1) + " ");
        // }

    // System.out.println(bruteForce(r-1, c-1));


    for(int r = 0;r< rows;r++){

        for (int s = 0; s < rows - r; s++) {
            System.out.print(" ");
        }

        for(int c= 0;c<=r;c++){
            System.out.print(bruteForce(r-1, c-1) + " ");
        }
        System.out.println();
    }

    }
}
