package class_and_object;

public class Employee_Method {

    public void method(){
        System.out.println("This is my default method ");
    }
    public void employee(){
        System.out.println("this method know about employee ");
    }
    public void  method_making(){
        System.out.println(" this method gives information of employee ");
    }

    String name="Rudra pratap singh";
    int age=22;
    String qualification="B.Tech";
    double salary=100000;
    public static void main(String[] args) {
        Employee_Method obj1= new Employee_Method();
        System.out.println("Employee name "+obj1.name +" age "+obj1.age + " Qualification " + obj1.qualification+" Salary " + obj1.salary );

        Employee_Method obj= new Employee_Method();
        obj.method();
        obj.employee();
        obj.method_making();
    }
}
