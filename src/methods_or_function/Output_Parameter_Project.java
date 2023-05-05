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
        if (age >= 18 && city.equals("Kanpur")) {
            return true;
        } else {
            return false;
        }
    }
    //Project 3 :-============================

    // Write a program to print 1 to 100 number & also find the Even Number & Odd Number using Output parameter method

    public boolean findNumber(int number){
        if (number%2==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main (String[]args){
        Output_Parameter_Project obj = new Output_Parameter_Project();
        int cube = obj.makeCube(12);
        System.out.println("Cube of given number is :- " + cube);

        // 2nd Program Output========================================

        if (obj.eligibale(19,"Kanpur")){
            System.out.println("Person is eligible for voting...");
        }else {
            System.out.println("Please enter the valid person details... ");
        }
        // 3rd Program Output========================================
        for (int i=1;i<=100;i++){
            if(obj.findNumber(i)){
                System.out.println("Even Number :- "+i);
            }else {
                System.out.println("Odd Number :- "+i);
            }
        }
    }
}
