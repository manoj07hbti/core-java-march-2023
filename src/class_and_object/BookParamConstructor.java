package class_and_object;

public class BookParamConstructor {

    //data members , do not assign values
    String name;
    int pages;
    String writerName;

    // parametrized constructor

    public BookParamConstructor(String name, int pages, String writerName) {
        this.name = name;
        this.pages = pages;
        this.writerName = writerName;
    }

    public static void main(String[] args) {

        //SYNTAX   ClassName objName= new ClassName(value1, value2, value3.......valueN);

        BookParamConstructor obj1= new BookParamConstructor("Java",600,"Games Gosling");

        System.out.println("Name: "+obj1.name+" Page: "+obj1.pages+" Writer: "+obj1.writerName);

        BookParamConstructor obj2= new BookParamConstructor("Spring",300,"Writer of Spring");

        System.out.println("Name: "+obj2.name+" Page: "+obj2.pages+" Writer: "+obj2.writerName);

        BookParamConstructor obj3= new BookParamConstructor("Cloud",200,"Writer of Cloud");

        System.out.println("Name: "+obj3.name+" Page: "+obj3.pages+" Writer: "+obj3.writerName);
    }

}
