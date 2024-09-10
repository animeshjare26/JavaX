package AdvPatterns;

public class p11 {

    public static void square12(int n) {
        
        for(int i = 1;i <= n;i++){

            for(int j =1;j<= n+2;j++){
                int sum = i+j;
                if(j % 2 == 0){
                    System.out.print("2");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();

        }
    }
    
   public static void main(String[] args) {
    square12(4);
   }
}
