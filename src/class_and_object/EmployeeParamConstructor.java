package class_and_object;

import jdk.nashorn.internal.runtime.regexp.joni.Syntax;

public class EmployeeParamConstructor {

    String name;
    String Company;
    int age;
    double salary;
    // parametrized constructor:

    public EmployeeParamConstructor(String name, String company, int age, double salary) {
        this.name = name;
        Company = company;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args) {

        // SYNTAX ClassName = new ClassName
        EmployeeParamConstructor obj1 = new EmployeeParamConstructor("Sunil","Airtel",28,850000.25);
        System.out.println("Name:"+ obj1.name + " company " + obj1.Company  + " age "+obj1.age + " salary " + obj1.salary);

        EmployeeParamConstructor obj2 = new EmployeeParamConstructor("Dev","Adaop",30,900000);
        System.out.println("Name:"+ obj2.name + " company " + obj2.Company  + " age "+obj2.age + " salary " + obj2.salary);

        EmployeeParamConstructor obj3 = new EmployeeParamConstructor("Dany","Hutch",26,1100000);
        System.out.println("Name:"+ obj3.name + " company " + obj3.Company  + " age "+obj3.age + " salary " + obj3.salary);

        EmployeeParamConstructor obj4 = new EmployeeParamConstructor("Nancy","L.G",27,950000);
        System.out.println("Name:"+ obj4.name + " company " + obj4.Company  + " age "+obj4.age + " salary " + obj4.salary);

        EmployeeParamConstructor obj5 = new EmployeeParamConstructor("devid","HCL",24,1250000);
        System.out.println("Name:"+ obj5.name + " company " + obj5.Company  + " age "+obj5.age + " salary " + obj5.salary);

    }


    }

