package class_and_object;

public class Employe {
    //class properties are predefined in default constructor
    int id = 1163;
    String name = "VINAY";
    int age = 21;
    double salary=42587.56;
    String department = "Software";

    public static void main(String[] args){

        //ClassName objName= new ClassName();
        Employe obj1= new Employe();
        System.out.println("printing object 1 of Employee class \n "+"ID : "+obj1.id +"\nNAME : "+obj1.name +"\nAGE : "+obj1.age +"\nSALARY : "+obj1.salary +"\nDEPARTMENT : "+obj1.department );

        Employe obj2= new Employe();
        System.out.println("\nprinting object 2 of Employee class\n" +"ID : "+obj2.id +"\nNAME : " +obj2.name +"\nAGE : "+obj2.age +"\nSALARY : "+obj2.salary +"\nDEPARTMENT : "+obj2.department);

        Employe obj3= new Employe();
        System.out.println("\nprinting object 2 of Employee class\n" +"ID : "+obj3.id +"\nNAME : " +obj3.name +"\nAGE : "+obj3.age +"\nSALARY : "+obj3.salary +"\nDEPARTMENT : "+obj3.department);

    }
}
