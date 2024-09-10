package oops;

import Recursion.ntoOne;

//blueprint of pen
class Pen{
    String color;
    String type;  //ballpoint , gel-pen

    public void write(){
      System.out.println("writing something " + this.type) ;
    }

    public void print(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age; 
    }
    Student(){

    }
}



public class classes {
    public static void main(String[] args) {
       
        Student s1 = new Student();
        s1.name = "jeet";
        s1.age =24;


        Student s2 = new Student(s1);
        s2n.printName();
    }
    
}


//java requires fully clasified class name rather than file name 
// execution : java oops.classes