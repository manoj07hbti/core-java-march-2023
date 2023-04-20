package class_and_object;

public class Engineer_Method {
    public void method(){
        System.out.println(" This is my default method ");
    }
    public void engineer(){
        System.out.println(" This method gives us engineer's information ");
    }
    public void method_making(){
        System.out.println(" This is engineer's method ");
    }
    String name="Ram";
    int age=25;
    String qualification="B.Tech";
    double salary=250000;

    public static void main(String[] args) {

        Engineer_Method obj1=new Engineer_Method();
        System.out.println("Engineer name: "+obj1.name+" age: "+obj1.age+" Qualification: "+obj1.qualification+" Salary: "+obj1.salary);

        Engineer_Method obj=new Engineer_Method();
        obj.method();
        obj.engineer();
        obj.method_making();
    }
}
