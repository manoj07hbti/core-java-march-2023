package class_and_object;

public class Student_with_Method {
    //creating new method
    public void read(){
        System.out.println("STUDENT READ A BOOK");
    }
    public void write(){
        System.out.println("STUDENT WRITE IN NOTEBOOK");
    }
    public void test(){
        System.out.println("STUDENT GIVES TEST");
    }
    public static void main(String[] args) {
     Student_with_Method obj=new Student_with_Method();
     obj.read();
     obj.write();
     obj.test();
    }
}
