package conditional_statements;

public class NestedIf {

    public static void main(String[] args) {
        int age=19;

        if(age>0){

            if(age>=18){

                System.out.println("Eligible for Voting ...");
            }else {
                System.out.println("NOT Eligible for voting ...");
            }

        }else {
            System.out.println("Please enter valid number for age");
        }

      String city="Delhi";

        if (city=="AGRA"){

            if(age>=18){

                System.out.println("Eligible for Voting in AGRA...");
            }else {
                System.out.println("NOT Eligible for voting ...");
            }
        }else {

            System.out.println("Voting is allowed only for AGRA People");
        }



    }
}
