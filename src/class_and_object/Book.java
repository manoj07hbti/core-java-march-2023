package class_and_object;

public class Book {

    String name ="java";
    int pages= 500;
    String writername= " jams Gosling";

    public static void main(String[] args) {
        Book obj = new  Book();
        System.out.println("details of book.."+obj.name+" pages.."+obj.pages+" writer name.."+obj.writername);
        Book obj2=new Book();
        System.out.println("details of book.."+obj2.name+" pages.."+obj2.pages+" writer name.."+obj2.writername);
        Book obj3=new Book();
        System.out.println("details of book.."+obj3.name+" pages.."+obj3.pages+" writer name.."+obj3.writername);
        Book obj4=new Book();
        System.out.println("details of book.."+obj4.name+" pages.."+obj4.pages+" writer name.."+obj4.writername);


     }
    }

