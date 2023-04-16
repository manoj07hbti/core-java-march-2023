package class_and_object;

public class BookParamConstructor {
    // data member , do not assign value
    String name;
    int pages;
    String WriterName;

    // parametrized constructor:

    public BookParamConstructor(String name, int pages, String writerName) {
        this.name = name;
        this.pages = pages;
        WriterName = writerName;
    }

    public static void main(String[] args) {

        // SYNTAX ClassName object= new ClassName (value1,value2, value3.............valueN):
       BookParamConstructor obj1= new BookParamConstructor("Mind Reader",600,"Jones");

        System.out.println("Name:"+obj1.name+"pages: "+obj1.pages+"Writer:"+obj1.WriterName);

        BookParamConstructor obj2= new BookParamConstructor("Spring",400,"Tin Dremo");
        System.out.println("Name:"+obj2.name+"pages: "+obj2.pages+"Writer:"+obj2.WriterName);

        BookParamConstructor obj3= new BookParamConstructor("Java",700,"devid");
        System.out.println("Name:"+obj3.name+"pages: "+obj3.pages+"Writer:"+obj3.WriterName);




    }

}
