package Class_Object;

public class Employee {

    // data member or properties of class..
    String name ="RAHUL";
    int age=30;
    String company="TCS";
    String post ="ACCOUNTANT";
    double salary= 33000;

    public void work(){
        System.out.println(" Eployee work daily in office");
    }

    public static void main(String []args){
        Employee obj1=new Employee();
        System.out.println("Employee name "+ obj1.name +" age " +obj1.age+" company "+obj1.company+" post "+obj1.post);

    }
}




