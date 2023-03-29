package conditional_statements;

public class DemoIfCondition {

    public static void main(String[] args) {

       //SYNTAX :  if(expression){ CODE }

        int age;// variable declaration

        age=60;

        if(age>=60){
            System.out.println("Person is old Age "+age);

        }

        // to check person is eligible for voting

        age=21;

        if(age >= 18){

            System.out.println("Person is eligible for voting "+age);
        }

        //   to check person is NOT eligible for voting
        age=5;
        if(age < 18){

            System.out.println("Person is not eligible for voting "+age);
        }

        String city="AGRA";

        if(city == "AGRA"){

            System.out.println("Person belongs to Agra city ");
        }

        // to check person does not belong to AGRA

        city="Pune";
        if(city !="AGRA" ){

            System.out.println("Person does not belongs to AGRA ");
        }


    }

}
