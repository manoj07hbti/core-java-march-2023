package important_keywords;

public class DemoStatic {

    static String var="Java";// STATIC

    String name="Test";//NON STATIC depends on object
    public static void m1(){

        System.out.println("This is my static method ");
    }
    public static void m1(String city){

        System.out.println("OVERLOADED This is my static method "+city);
    }

    public static void main(String[] args) {
// SYNTAX : ClassName.methodName();
        DemoStatic.m1();
        DemoStatic.m1("AGRA");

        System.out.println("Printing Static variable :" +DemoStatic.var);

    }
}
