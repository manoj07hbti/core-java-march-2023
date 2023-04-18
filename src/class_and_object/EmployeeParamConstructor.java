package class_and_object;

public class EmployeeParamConstructor {
    String name;
    int age;
    double salary;

    public EmployeeParamConstructor(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }



    public static void main(String[] args) {
        EmployeeParamConstructor obj1=new EmployeeParamConstructor("Rakesh",27,25000);
        System.out.println("Name: "+obj1.name+" age: "+obj1.age+" salary: "+obj1.salary);

        EmployeeParamConstructor obj2=new EmployeeParamConstructor("Bhandari",30,30000);
        System.out.println("Name: "+obj2.name+" age: "+obj2.age+" salary: "+obj2.salary);

        EmployeeParamConstructor obj3=new EmployeeParamConstructor("Sachdeva",24,3004);
        System.out.println("Name: "+obj3.name+" age: "+obj3.age+" salary: "+obj3.salary);

        EmployeeParamConstructor obj4=new EmployeeParamConstructor("Mukesh",23,24000);
        System.out.println("Name: "+obj4.name+" age: "+obj4.age+" salary: "+obj4.salary);

        EmployeeParamConstructor obj5=new EmployeeParamConstructor("Sukhdev",35,40000);
        System.out.println("Name: "+obj5.name+" age: "+obj5.age+" salary: "+obj5.salary);
    }
}
