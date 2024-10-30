package DSA_sheet;

public class PascalTriangle {
    
    //if R n C given and we have to find out the place of element on R =5 , C = 3  i.e 6;
    static int bruteForce(int n , int r){
        int res = 1;

        for(int i = 0 ;i < r;i++){
            res = res * (n-i);
            res = res / (i+ 1);
        }
        return res;

    }

    public static void main(String[] args) {
        int r = 5 , c = 3;

        System.out.println(bruteForce(r-1, c-1));
    }
}
