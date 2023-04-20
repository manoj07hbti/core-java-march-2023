package class_and_object;

public class Engineer {
    String name = "Vicky singh";
    int age = 25;
    double salary = 952244.56;
    String company = "idia";

    public static void main(String[] args) {
        // Classname object = ClassName();
      Engineer obj1 = new Engineer();
      System.out.println("Engineer obj1 "+ obj1.name + " age "+ obj1.age  + " salary "+ obj1.salary + " company "+ obj1.company);

        Engineer obj2 = new Engineer();
        System.out.println("Engineer obj2 "+ obj2.name + " age "+ obj2.age  + " salary "+ obj2.salary + " company "+ obj2.company);

        Engineer obj3 = new Engineer();
        System.out.println("Engineer obj3 "+ obj3.name + " age "+ obj3.age  + " salary "+ obj3.salary + " company "+ obj3.company);

        Engineer obj4 = new Engineer();
        System.out.println("Engineer obj1 "+ obj4.name + " age "+ obj4.age  + " salary "+ obj4.salary + " company "+ obj4.company);

        Engineer obj5= new Engineer();
        System.out.println("Engineer obj1 "+ obj5.name + " age "+ obj5.age  + " salary "+ obj5.salary + " company "+ obj5.company);

    }
}
