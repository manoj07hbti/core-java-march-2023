package opps.inheritance;

public class Class_B extends Class_A {

    public void m3(){
        System.out.println("This Is the Class B M3 Method");
    }
    public static void main(String[] args) {
        Class_B obj=new Class_B();
        obj.m1();
        obj.m2();
    }
}
