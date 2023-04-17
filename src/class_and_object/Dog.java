package class_and_object;

public class Dog {
    String breed="DoberMan";
    String name="Bruno";
    int age=3;
    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void barkMethod(){
        System.out.println("THis is Bark Method of Dog CLass.....");
    }

    public void run(){
        System.out.println("THis is Run Method of Dog CLass.....");

    }

    public static void main(String[] args) {
     //  step 1
        Dog obj1= new Dog();

        System.out.println("Printing obj1 of Dog: "+obj1.breed +" Name: "+obj1.name +" Age: "+obj1.age);
// step 2:
        obj1.run();
        obj1.barkMethod();
    }


}
