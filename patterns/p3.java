package patterns;

/*
  print 
 1
 12
 123
 1234
 */
public class p3 {
   public static void main(String[] args) {
    int n =4;
    for(int i =1;i<= n;i++){
        for(int j =1;j<= n-i+1;j++){
            System.out.print(j);
        }
        System.out.println();
    }
   }
}

/*
 * similarly print
 * 4321
 * 321
 * 21
 * 1
 * 
 */

/**
 * p3
 */
// public class p3 {

// public static void main(String[] args) {
// for(int i = 1; i <=4;i++){
// for(int j =1;j<= 4-i+1;j++){
// System.out.print(j);
// }
// System.out.println();
// }
// }
// }