package class_and_object;

public class Employee {

    // properties or data member
   String name= "Sunil";
       String company ="Airtel";
    int age= 28;
        double salary = 850000.25;

    public static void main(String[] args) {
        // Classname object = ClassName();
        Employee obj1=new Employee();// created object using default constructor
        System.out.println("Employee name "+ obj1.name +" company " + obj1.company +" age " + obj1.age +" salary "+ obj1.salary);

        Employee obj2=new Employee();
        System.out.println("Employee name "+ obj2.name +" company " + obj2.company +" age " + obj2.age +" salary "+ obj2.salary);

        Employee obj3=new Employee();
        System.out.println("Employee name "+ obj3.name +" company " + obj3.company +" age " + obj3.age +" salary "+ obj3.salary);

        Employee obj4=new Employee();
        System.out.println("Employee name "+ obj4.name +" company " + obj4.company +" age " + obj4.age +" salary "+ obj4.salary);

        Employee obj5=new Employee();
        System.out.println("Employee name "+ obj5.name +" company " + obj5.company +" age " + obj5.age +" salary "+ obj5.salary);


    }




}
