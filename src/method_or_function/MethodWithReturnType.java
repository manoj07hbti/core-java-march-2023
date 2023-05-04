package method_or_function;

public class MethodWithReturnType {
    // write a method which give cube of given number

    public int makeCube(int number) {

        int cube = number * number * number;

        return cube;
    }

    // write a method which given square of given number:
    public int makeSquare(int number) {
        int square = number * number;

        return square;
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

        int secondresult = obj.makeSquare(8);
        System.out.println("square of given number is :"+secondresult);

        String name = obj.addSurName("Niranjan");

        System.out.println("Full name is " + name);

    }


}
