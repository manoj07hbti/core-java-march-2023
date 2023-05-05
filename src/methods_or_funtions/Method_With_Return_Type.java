package methods_or_funtions;

public class Method_With_Return_Type {
    public int makeCube(int number){
    int cube = number * number * number;

        return cube;
}

    public String addSurName(String firstName) {

        String fn = firstName + " Singh";

        return fn;
    }

    public static void main(String[] args) {

        Method_With_Return_Type obj = new Method_With_Return_Type();
        int result = obj.makeCube(6);

        System.out.println("cube of given number is :" + result);

        String name = obj.addSurName("Niranjan");

        System.out.println("Full name is " + name);

    }


}
