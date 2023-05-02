package method_or_function;

public class MethodWithInputParam {
    public void makeSquare(int number){

        int square=number*number;
        System.out.println("Square of given number is "+square);
    }

    // access_specifier return_type  method_name (Datatype varName1,Datatype varName2,Datatype varName3....) {CODE..}
    public void voting(int age, String city){
        if(age>=18 && city.equals("Tundla")){

            System.out.println("eligible for Voting in Tundla ");
        }else {
            System.out.println("Not Eligible for voting in  Tundla ");
        }

    }

    public void voting(int age, String city,String name){
        if(age>=18 && city.equals("Tundla")){

            System.out.println(name+ " is eligible for Voting in Tundla ");
        }else {
            System.out.println(name + " is Not Eligible for voting in Tundla ");
        }

    }
    public static void main(String[] args) {
        MethodWithInputParam obj= new MethodWithInputParam();
        obj.makeSquare(5);
        obj.makeSquare(8);
        obj.makeSquare(9);

        obj.voting(22,"Tundla");
        obj.voting(12,"Tundla");
        obj.voting(21,"Agra");

        obj.voting(21,"Tundla","Sunu sharma");
        obj.voting(12,"Tundla","Kartik ");

    }
}


