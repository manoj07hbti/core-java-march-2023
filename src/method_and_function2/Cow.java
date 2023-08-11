package method_and_function2;

public class Cow {
    // Eat , milk , Run......*

    //Note- Note-(1. Cannot create method inside method. 2- You can not duplicate method...)

    public void eatMethod(){    // public = access-specifier . void means - nothing will be return. after that method name(){.**/
        System.out.println("This is eat method"); //  then print the method...
    }
    public void milkMethod(){
        System.out.println("this is milk method");
    }
    public void runMethod(){
        System.out.println("this is run method");
    }

    public static void main(String[] args) {
        Cow obj = new Cow(); // first step create the method...
        obj.eatMethod();     // second step obj. methodName();...
        obj.milkMethod();    // then will be run...
        obj.runMethod();
    }
}
