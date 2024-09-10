package AdvPatterns;

/*Write a program for printing hollow rectangle */

public class p1 {
   public static void hollowRectangle(int row,int col) {
    for(int i = 1;i<= row;i++){
        for(int j =1;j<= col;j++){
            if(i ==1 || j==1 || i == row || j == col){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
   }
   public static void main(String[] args) {
    hollowRectangle(4, 8);
   }
}
