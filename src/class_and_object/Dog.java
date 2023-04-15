package class_and_object;

public class Dog {
    String Breed = "BullDog";
    String name = "Tiger";
    int age = 5;

    public static void main(String[] args) {
        Dog obj1 = new Dog();
        System.out.println("Printing obj1 Dog: " + obj1 .Breed  + "Name: " + obj1 . name + "Age: "+ obj1. age);

        Dog obj2 = new Dog();
        System.out.println("Printing obj2 Dog: " + obj2 .Breed + "Name: " + obj2 . name + "Age: "+ obj2 . age);

        Dog obj3 = new Dog();
        System.out.println("Printing obj1Dog: " + obj3 . Breed  + "Name: " + obj3 . name + "Age: "+ obj3 . age);
    }
}
