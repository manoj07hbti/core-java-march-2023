package class_and_object;

public class EngineerParamConstructor {
    String name ;
    int age ;
    double salary ;
    String company ;

    public EngineerParamConstructor(String name, int age, double salary, String company) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.company = company;
    }

    public static void main(String[] args) {
        EngineerParamConstructor obj1 = new EngineerParamConstructor("Vicky sing",25,95224.56,"Idia");
        System.out.println("name " + obj1.name + " age " + obj1.age + " salary " + obj1.salary + " company " + obj1.company);

        EngineerParamConstructor obj2 = new EngineerParamConstructor("viru",27,950000,"tvs");
        System.out.println("name " + obj2.name + " age " + obj2.age + " salary " + obj2.salary + " company " + obj2.company);

        EngineerParamConstructor obj3 = new EngineerParamConstructor("raju",25,850000,"MRF");
        System.out.println("name " + obj3.name + " age " + obj3.age + " salary " + obj3.salary + " company " + obj3.company);

        EngineerParamConstructor obj4 = new EngineerParamConstructor("Bhanu",24,700000,"BPL");
        System.out.println("name " + obj4.name + " age " + obj4.age + " salary " + obj4.salary + " company " + obj4.company);
    }
}
