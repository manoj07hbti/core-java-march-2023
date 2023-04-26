package methods_or_functions;

public class MethodWithReturnType {

    // write a method which give cube of given number
//Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public int makeCube(int number) {

        int cube = number * number * number;

        return cube;
    }

    // Add surname to any name
    public String addSurName(String firstName) {

        String fullname = firstName + " Singh";

        return fullname;
    }

    public static void main(String[] args) {

        MethodWithReturnType obj = new MethodWithReturnType();
        int result = obj.makeCube(3);// we need to store output in a variable

        System.out.println("cube of given number is :" + result);

        String name = obj.addSurName("Rahul");

        System.out.println("Full name is " + name);

    }


}
