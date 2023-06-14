package important_keywords;

public class ChildStatic extends DemoStatic{

    public static void m1(){

        System.out.println("This is my static method of Child class ....");
    }

    public static void main(String[] args) {
        ChildStatic.m1();
    }
}
