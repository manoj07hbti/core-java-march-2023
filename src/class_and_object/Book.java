package class_and_object;

public class Book {
    // properties or data member
    String name = "Mind Reader";
    int pages = 600;
    String writerName ="Jones";

    public static void main(String[] args) {
    // ClassName objectName = ClassName();

    Book obj1= new Book();// created object using Default Constructor
    System.out.println("Printing obj1 "  +obj1.name +" Writer  "+obj1.writerName+ " Pages " +obj1.pages);

        Book obj2= new Book();//
        System.out.println("Printing obj2 " +obj2.name +" Writer "+obj2.writerName+ " Pages " +obj2.pages);

        Book obj3= new Book();//
        System.out.println("Printing obj3 " +obj3.name +" Writer "+obj3.writerName+ " Pages " +obj3.pages);

    }
}
