package class_and_object;

public class Book {

    // properties or data member
    String name="Java";
    int pages=500;
    String writerName="Games Gosling";

    // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    void mymethod(){
        System.out.println("This is Default method of Book Class...");
    }
    public void readMethod(){

        System.out.println("This is Read Method of Book Class...");
    }
    public void writeMethod(){

        System.out.println("This is Write Method of Book Class ");
    }

    public static void main(String[] args) {
    //ClassName objName= new ClassName();

        Book obj1= new Book();// created object using Default Constructor
        System.out.println("Printing obj1 "+obj1.name +" Writer "+obj1.writerName+ " Pages "+obj1.pages);

        Book obj2= new Book();
        System.out.println("Printing obj2 "+obj2.name +" Writer "+obj2.writerName+ " Pages "+obj2.pages);

        Book obj3= new Book();
        System.out.println("Printing obj3 "+obj3.name +" Writer "+obj3.writerName+ " Pages "+obj3.pages);
// step 1
        Book obj= new Book();

//step 2
        obj.readMethod();// call read method
        obj.writeMethod();// call write method
    }



}
