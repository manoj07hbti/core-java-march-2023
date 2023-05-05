package method;

public class Book {

    public void read(){

        System.out.println("book is reading");
    }

    public void write() {

        System.out.println("writing ");
    }

    public static void main(String[] args) {
        Book obj= new Book();
        obj.read();
        obj.write();
    }

}
