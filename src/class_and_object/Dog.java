package class_and_object;

public class Dog {

    String name = " jimmi";
    int age=5;
    String breed="hasky";

    public static void main(String[] args) {

        Dog obj1=new Dog();
        System.out.println("print dogs details.."+obj1.name+" age  "+obj1.age+ " breed "+obj1.breed);

        Dog obj2=new Dog();
        System.out.println("print dogs details.."+obj2.name+" age  "+obj2.age+ " breed "+obj2.breed);
    }
}
