package methods_or_functions;

public class MethodWithInputParam {

    // access_specifier return_type  method_name (Datatype varName) {CODE..}

    public void makeSquare(int number){

       int square=number*number;
        System.out.println("Square of given number is "+square);
    }

    // access_specifier return_type  method_name (Datatype varName1,Datatype varName2,Datatype varName3....) {CODE..}
    public void voting(int age, String city){
        if(age>=18 && city.equals("Agra")){

            System.out.println("eligible for Voting in Agra ");
        }else {
            System.out.println("Not Eligible for voting in Agra ");
        }

    }

    public void voting(int age, String city,String name){
        if(age>=18 && city.equals("Agra")){

            System.out.println(name+ " is eligible for Voting in Agra ");
        }else {
            System.out.println(name + " is Not Eligible for voting in Agra ");
        }

    }
    public static void main(String[] args) {
        MethodWithInputParam obj= new MethodWithInputParam();
        obj.makeSquare(2);
        obj.makeSquare(3);
        obj.makeSquare(13);

        obj.voting(21,"Agra");
        obj.voting(12,"Agra");
        obj.voting(21,"Delhi");

        obj.voting(21,"Agra","Rahul");
        obj.voting(12,"Agra","Mohit");

    }
}
