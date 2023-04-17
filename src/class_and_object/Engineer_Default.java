package class_and_object;

import com.sun.xml.internal.ws.server.ServerRtException;

public class Engineer_Default {
    String name="Ram";
    int age=25;
    String qualification="B.Tech";
    double salary=250000;

    public static void main(String[] args) {
        Engineer_Default obj1=new Engineer_Default();
        System.out.println("Engineer name: "+obj1.name+" age: "+obj1.age+" Qualification: "+obj1.qualification+" Salary: "+obj1.salary);

        Engineer_Default obj2=new Engineer_Default();
        System.out.println("Engineer name: "+obj2.name+" age: "+obj2.age+" Qualification: "+obj2.qualification+" Salary: "+obj2.salary);

        Engineer_Default obj3=new Engineer_Default();
        System.out.println("Engineer name: "+obj3.name+" age: "+obj3.age+" Qualification: "+obj3.qualification+" Salary: "+obj3.salary);

        Engineer_Default obj4=new Engineer_Default();
        System.out.println("Engineer name: "+obj4.name+" age: "+obj4.age+" Qualification: "+obj4.qualification+" Salary: "+obj4.salary);

        Engineer_Default obj5=new Engineer_Default();
        System.out.println("Engineer name: "+obj5.name+" age: "+obj5.age+" Qualification: "+obj5.qualification+" Salary: "+obj5.salary);

    }
}
