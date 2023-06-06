package oops.polymorphism;

public class DemoMethodOverloading {

    public void m1(){
        System.out.println("This is M1 method");
    }
    //OVERLOADED METHOD
    public void m1(String name){
        System.out.println("This is overloaded M1 method with single String parameter: "+name);
    }
    //OVERLOADED METHOD
    public void m1(int age){
        System.out.println("This is overloaded M1 method with single int parameter: "+age);
    }
    public void m1(int age,String name){
        System.out.println("This is overloaded M1 method with two  parameter: "+age+" "+name );
    }


    public static void main(String[] args) {
        DemoMethodOverloading obj= new DemoMethodOverloading();
        obj.m1();
        obj.m1("Test");
        obj.m1(23);
        obj.m1(21,"Raj");
    }

}
