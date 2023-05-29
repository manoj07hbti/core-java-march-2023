package oops.inheritance;

public class B extends A {

    public void m3(){

        System.out.println("THis is m3 method of B Class ...");
    }
    public static void main(String[] args) {

        B obj= new B();

        obj.m1();
        obj.m2();
    }

}
