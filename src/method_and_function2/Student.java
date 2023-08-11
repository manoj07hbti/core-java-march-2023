package method_and_function2;

public class Student {

    // Eat, Play,Study
    // Note-(1. Cannot create method inside method. 2- You can not duplicate method...)

    public void eatMethod(){ //  First We create method...

     System.out.println("This is eat method");
    }
    public void playMethod(){

     System.out.println("This is my Play Method");
    }
    public void studyMethod(){

        System.out.println("This is  study method");
    }
    public static void main(String[] args) {

        Student obj = new Student(); // Create an object in the second step....
        obj.eatMethod();             // In the third option we call the method...

        obj.playMethod();
        obj.studyMethod();

    }
}
