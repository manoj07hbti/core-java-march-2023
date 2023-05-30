package oops.inheritence;

public class BabyDog extends Dog{
    public void weep(){
        System.out.println("BABY DOG WEEPS");
        }

    public static void main(String[] args) {
        BabyDog obj=new BabyDog();
        obj.eat();
        obj.bark();
        obj.sleep();
        obj.weep();
    }
}
