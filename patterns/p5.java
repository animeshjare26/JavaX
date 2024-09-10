package patterns;

/*
   Print  a  Hollow Rectangle   *****
                                *   *
                                *   *
                                *****
    
 */
public class p5 {
    public static void main(String[] args) {
        int m = 4;
    int n = 5;
    for(int i =1;i<=m;i++){
        for(int j= 1;j<=n;j++){
            if(i ==1 || j ==1 || i ==m || j ==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}
