  package Arrays;

import java.util.Scanner;
import java.util.*;

public class arrayCC {
    public static void main(String[] args) {

        int marks[] = new int[4];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("phy "+ marks[0]);
        System.out.println("chem "+ marks[1]);
        System.out.println("math "+ marks[2]);
        System.out.println(marks.length);

        System.out.println("original array" +Arrays.toString(marks));
        
        //sort
        Arrays.sort(marks);
        System.out.println("sorted :"+Arrays.toString(marks));

        for(int i = 0;i< marks.length;i++){
          System.out.print(marks[i] + " ");
        }
    }
}
