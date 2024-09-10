package AdvPatterns;

public class hollowRhombus {
    
    public static void hollowRhombus(int n){

        for(int i = 1;i<=n;i++){
            //spaces
            for(int j =1;j<= (n - i);j++){
                System.out.print(" ");
            }
            //stars but only at the edges means it should be hollow
            for(int j = 1;j <= n;j++){

                if(i==1 || j ==1 || i == n || j ==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollowRhombus(7);
    }
}
