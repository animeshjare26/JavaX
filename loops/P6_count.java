package loops;

/*Count the number of digits in a number */

import java.util.*;
public class P6_count {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a nnumner :");
    int n = sc.nextInt();
    int count =0;
    while(n>0){
      n = n /10;
      count++;
    }
    System.out.println("count of a number :" + count);
    sc.close();
  }  
}
