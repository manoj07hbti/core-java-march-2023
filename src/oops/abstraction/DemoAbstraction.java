package oops.abstraction;

public abstract class DemoAbstraction {

    //access_specifier abstract return_type method_name(input param);

    public abstract void m1();// Hidden

    public void m2(){
        System.out.println("This is normal method");
    }

    public void m3(){
        System.out.println("This is normal method m3 ");
    }

    public static void main(String[] args) {
        DemoAbstraction obj;
      /*  DemoAbstraction obj= new DemoAbstraction();

        obj.m1();// m1 is a abstract method and do not have any code to execute */

    }
}
