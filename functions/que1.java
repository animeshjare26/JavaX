package functions;

import java.util.Scanner;

public class que1 {
    public static double averageOfThree(double a , double b , double c ){
        double avg = (a + b+ c) / 2;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        double x = sc.nextDouble();
        System.out.println("Enter the second number :");
        double y = sc.nextDouble();
        System.out.println("Enter the third number :");
        double z = sc.nextDouble();
       System.out.println("The average of three numbers is :"+ averageOfThree(x,y,z));
       sc.close();
    }
}
