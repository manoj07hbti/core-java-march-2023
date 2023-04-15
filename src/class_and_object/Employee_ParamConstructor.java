package class_and_object;

public class Employee_ParamConstructor {
    String id ;
    String name;
    int age;
    double salary;
    String department;

    //parameterized constructor

    public Employee_ParamConstructor(String id, String name, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public static void main(String[] args) {

        Employee_ParamConstructor obj1=new Employee_ParamConstructor("EMP4585","AMAN",26,45964.45,"SOFTWARE");
        System.out.println("printing object 1 of Employee class \n "+"ID : "+obj1.id +"\nNAME : "+obj1.name +"\nAGE : "+obj1.age +"\nSALARY : "+obj1.salary +"\nDEPARTMENT : "+obj1.department );

        Employee_ParamConstructor obj2=new Employee_ParamConstructor("EMP4596","RAHUL",24,45887.58,"MARKETING");
        System.out.println("\nprinting object 1 of Employee class \n "+"ID : "+obj2.id +"\nNAME : "+obj2.name +"\nAGE : "+obj2.age +"\nSALARY : "+obj2.salary +"\nDEPARTMENT : "+obj2.department );

        Employee_ParamConstructor obj3=new Employee_ParamConstructor("EMP1522","AJEET",29,47123.44,"HARDWARE");
        System.out.println("\nprinting object 1 of Employee class \n "+"ID : "+obj3.id +"\nNAME : "+obj3.name +"\nAGE : "+obj3.age +"\nSALARY : "+obj3.salary +"\nDEPARTMENT : "+obj3.department );

    }
}
