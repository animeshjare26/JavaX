package functions;

public class swap {

    public static void changeA (int a ){
        a = 20;
        System.out.println(" a  ="+ a);

    }

    public static  void swaping(int a , int b){
        int temp =  a;
         a = b; 
         b = temp;
         System.out.println("a is "+a);
         System.out.println("b is "+b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        changeA(a);
        System.out.println("in main fnction === a :" + a);

        swaping(a, b);
        System.out.println("in main function "); 
        
        System.out.println("a is "+a);
        System.out.println("b is "+b);


    }
}
