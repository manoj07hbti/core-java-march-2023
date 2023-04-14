package class_and_object;

public class DogParamConstructor {

    String breed;
    String name;
    int age;

    public DogParamConstructor(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        DogParamConstructor obj1= new DogParamConstructor("Husky","John",4);
        System.out.println("Printing obj1 of Dog: "+obj1.breed +" Name: "+obj1.name +" Age: "+obj1.age);

        DogParamConstructor obj2= new DogParamConstructor("Labra","Max",5);
        System.out.println("Printing obj1 of Dog: "+obj2.breed +" Name: "+obj2.name +" Age: "+obj2.age);
    }
}
