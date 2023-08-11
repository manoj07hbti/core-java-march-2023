package method_and_function2;

import java.sql.SQLOutput;

public class Book {
    // Read, Write...*

    public void readMethod() {
        System.out.println("This is method of read");
    }

    public void writeMethod() {
        System.out.println("This is method of write");
    }

    public static void main(String[] args) {


        Book obj = new Book();
        obj.readMethod();
        obj.writeMethod();
    }
}