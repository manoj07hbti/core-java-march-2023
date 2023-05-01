package class_and_object;

public class EmployeeObjectParamConstructor {

    String name;
    int age;
    String department;

    public EmployeeObjectParamConstructor(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public static void main(String[] args) {
        EmployeeObjectParamConstructor obj = new EmployeeObjectParamConstructor("Raj",23,"it");

        EmployeeObjectParamConstructor obj2= new EmployeeObjectParamConstructor("Sachin", 34,"civil");

        EmployeeObjectParamConstructor obj3=new EmployeeObjectParamConstructor("Neha",25,"CS");

        System.out.println("Employee Data  : "+obj.name+ " age "+obj.age+ " department "+obj.department);

        System.out.println("Employee Data  : "+obj2.name+ " age "+obj2.age+ " department "+obj2.department);

        System.out.println("Employee Data  : "+obj3.name+ " age "+obj3.age+ " department "+obj3.department);
    }
}
