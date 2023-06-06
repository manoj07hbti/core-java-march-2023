package oops.polymorphism;

public class Polymorphism_DemoMethodOverloading {
    public void m1(){
        System.out.println("This is m1 method");
    }
    //method overloading
    public void m1(String name){
        System.out.println("this is overloaded m1 method with single String parameter :"+name);
    }
    public void m1(int age){
        System.out.println("this is overloaded m1 method with single int parameter :"+age);
    }
    public void m1(String name,int age){
        System.out.println("this is overloaded m1 method with both int and string parameter  :"+name+" "+age);
    }

    public static void main(String[] args) {
        Polymorphism_DemoMethodOverloading obj=new Polymorphism_DemoMethodOverloading();
        obj.m1();
        obj.m1("ROHAN");
        obj.m1(23);
        obj.m1("AMIT",25);
    }
}
