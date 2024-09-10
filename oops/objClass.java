package oops;


public class objClass {
    public static void main(String[] args) {
        Pen P1 = new Pen();

        P1.setColor("red");
        
        P1.color = "Blue";
        System.out.println(P1.color);


    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
}
