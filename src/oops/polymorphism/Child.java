package oops.polymorphism;

public class Child extends Polymorphism_DemoOverriding{

    @Override
    public void m1(){
        System.out.println("this is method of child class...");
    }

    public static void main(String[] args) {
        Polymorphism_DemoOverriding obj=new Polymorphism_DemoOverriding();

        //Q1
        obj.m1(); //it will call parent class method

        //Q2
        Polymorphism_DemoOverriding obj2=new Child();
        obj2.m1();//it will call child class method

        //Q3
       // Child obj3 = new Polymorphism_DemoOverriding();
        //obj3.m1(); // child class method can not hold tha parent class method
    }
}
