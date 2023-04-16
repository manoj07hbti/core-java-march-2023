package Class_Object;

public class Parameterized_constructor_Employee {

    // data member or properties of class
    String name;
    int age;
    String company;
    String post;
    double salary; // salary in thounsand..


    // create parameterized constructor


    public Parameterized_constructor_Employee(String name, int age, String company, String post, double salary) {
        this.name = name;
        this.age = age;
        this.company = company;
        this.post = post;
        this.salary = salary;
    }
    public static void main(String[]args){
         Parameterized_constructor_Employee obj1=new Parameterized_constructor_Employee("raj",30,"TCS","Engg",45);
         System.out.println("Employee name "+ obj1.name +" age " +obj1.age+" company "+obj1.company+" post "+obj1.post);

         Parameterized_constructor_Employee obj2=new Parameterized_constructor_Employee("Prem",28,"SRS","CSE",56.44);
         System.out.println("Employee name "+ obj2.name +" age " +obj2.age+" company "+obj2.company+" post "+obj2.post);

         Parameterized_constructor_Employee obj3=new Parameterized_constructor_Employee("RAHUL",31,"WIPRO","DS",80.66);
         System.out.println("Employee name "+ obj3.name +" age " +obj3.age+" company "+obj3.company+" post "+obj3.post);

         Parameterized_constructor_Employee obj4=new Parameterized_constructor_Employee("AMIHSA",26,"COFORGE","Software doveloper",90.44);
         System.out.println("Employee name "+ obj4.name +" age " +obj4.age+" company "+obj4.company+" post "+obj4.post);
    }


}
