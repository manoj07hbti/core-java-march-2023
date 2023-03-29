package conditional_statements;

public class DemoIfAndElse {

    public static void main(String[] args) {

        String city="Pune";

        if(city=="AGRA"){
            System.out.println("Person belongs to Agra ...");
        } else {
            System.out.println("Person does not belongs to Agra ...");
        }


        // check person is eligible for voting or not
        int age=21;

        if(age>=18){
            System.out.println("Person is eligible for voting ");
        }else {
            System.out.println("Person is not eligible for voting ");
        }


    }
}
