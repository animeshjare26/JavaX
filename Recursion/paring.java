package Recursion;

public class paring {

    public static int friendsParing(int n) {

        //BAse Case
        if(n==1 || n ==2){
            return n;
        }
        // //choice 

        //single
        // int fnm1 = friendsParing(n-1);
        // //pair 
        // int fnm2 = friendsParing(n-2);

        //pair ways 

        // int pairWays = (n-1) * fnm2;


         //total ways

        // int totalWays = fnm1 + pairWays;

        // return totalWays;

        return friendsParing(n-1) + (n-1) * friendsParing(n-2);


    }
 
    public static void main(String[] args) {
        System.out.println(friendsParing(3));
    }
}
