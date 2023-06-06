package oops.polymorphism;

public class Child extends DemoMethodOverriding{

    @Override
    public void m1(){
        System.out.println("This is M1 method of Child Class...");
    }


    public static void main(String[] args) {
        DemoMethodOverriding obj= new DemoMethodOverriding();
     //Q1
        obj.m1();// IT WILL CALL PARENT CLASS METHOD
     //Q2
        DemoMethodOverriding obj1= new Child();

        obj1.m1();// OBJECT IS CREATED OF CHILD SO IT WILL CALL CHILD CLASS METHOD ONLY
     //Q3
        /*Child obj2= new DemoMethodOverriding();

        obj2.m1();// COMPILE TIME ERROR , CHILD CLASS CAN NOT HOLD PARENT CLASS OBJECT*/


    }
}
