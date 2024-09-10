package AdvPatterns;

/*Progarm to print inverted Half-Pyramid with numbers */

public class p3 {

    public static void invertedNumPyramid(int n) {
        for(int i =1;i<= n;i++){

            for(int j = 1;j <= (n - i)+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
    invertedNumPyramid(5);
   }
}
