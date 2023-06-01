package oops.abstraction;

public class Child extends DemoAbstraction{
    @Override
    public void A() {
        System.out.println("THIS IS METHOD A");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.A();
        obj.b();
        obj.c();
    }
}
