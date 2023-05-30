package oops.inheritence;

public class Dog extends Animal{
    public void bark(){
        System.out.println("DOG BARKS");
    }

    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.eat();
        obj.sleep();
        obj.bark();
    }
}
