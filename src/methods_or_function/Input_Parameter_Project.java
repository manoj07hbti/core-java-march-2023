package methods_or_function;

public class Input_Parameter_Project {
    // Project 1:-==============
    // Using Method with Input Parameter create Any Number Cube & Square Project================================

    //Creating Cube Project using Input Parameter
    public void makeCube(int number){
        int cube=number*number*number;
        System.out.println("Cube Value of Given Number is :- "+cube);
    }

    //Creating Square Project using Input Parameter

    public void makeSquare(int number){
        int square=number*number;
        System.out.println("Square Value of Given Number is :- "+square);
    }

    // Project 2:-=======
    //Using Method with Input Parameter create project to check Person city & Elagibale for voting or/Not==============

    public void Eligible(int age,String city){
        if (age>=18 && city.equals("Kanpur")) {
            System.out.println("Person is Eligible for Voting in Kanpur:- "+age);
        }else {
            System.out.println("Person is Not Eligible for Voting in Kanpur :- "+age);
        }
    }

    //Project 2:-=======(2nd Option)
    public void Voting(int age,String city,String name){
        if (age>=18 && city.equals("Kanpur")) {
            System.out.println(name+ " is Eligible for Voting in Kanpur:- "+"Age:- "+age);
        }else {
            System.out.println(name+ " is Not Eligible for Voting in Kanpur :- "+"Age:- "+age);
        }
    }

    public static void main(String[] args) {
        Input_Parameter_Project obj=new Input_Parameter_Project();
        obj.makeCube(18);
        obj.makeSquare(12);

        obj.Eligible(23,"Kanpur");
        obj.Eligible(23, "Delhi");

        obj.Voting(21,"Kanpur","Amit");
        obj.Voting(26,"Lucknow","Akash");
    }

}
