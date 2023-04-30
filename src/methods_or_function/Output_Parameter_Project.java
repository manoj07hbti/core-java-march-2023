package methods_or_function;

public class Output_Parameter_Project {
    //using Output Parameter for create project============================
    //Project1 :-============================

    // Write a program to print cube of any number using Output parameter method

    public int makeCube(int number) {
        int cube = number * number * number;
        return cube;
    }

    //Project2 :-============================

    // Write a program to print eligible person for Voting or not using Output parameter method

    public boolean eligibale  (int age, String city) {
        if (age <= 18 && city.equals("Kanpur")) {
            return true;
        } else {
            System.out.println("Please enter the valid person detail");
            return false;
        }
    }

    public static void main (String[]args){
        Output_Parameter_Project obj = new Output_Parameter_Project();
        int cube = obj.makeCube(12);
        System.out.println("Cube of given number is :- " + cube);
        if (obj.eligibale(19,"Kanpur")){
        }
    }
}
