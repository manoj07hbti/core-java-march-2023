package oops.abstraction;

public class ChildInterface extends Child implements DemoInterface {
    @Override
    public void m1() {
        System.out.println("THis is m1");
    }

    @Override
    public void m2() {
        System.out.println("THis is m2");
    }
}
