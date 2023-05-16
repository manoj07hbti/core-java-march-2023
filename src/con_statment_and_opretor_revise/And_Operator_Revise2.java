package con_statment_and_opretor_revise;

public class And_Operator_Revise2 {
    public static void main(String[] args) {
        int age;
        String city;

        // TRUE & TRUE = TRUE;

        age = 18;
        city = "Pune";
        if (age >= 18 & city == "Pune") {

            System.out.println("The person can play the cricket");
        } else {
            System.out.println("The person not play the cricket");
        }

        // TRUE & TRUE = TRUE;


        age = 6;
        city = "Agra";
        if (age >= 5 & city == "Agra") {

            System.out.println("The child is eligible for Adhar card");
        } else {
            System.out.println("The child is not eligible for Adhar card");
        }

        // TRUE & FALSE = FALSE;

        age = 18;
        city = "Pune";
        if (age >= 18 & city == "Agra") {

            System.out.println("The person can play the cricket");
        } else {
            System.out.println("The person not play the cricket");
        }

        // TRUE & FALSE = FALSE;

        age = 6;
        city = "Pune";
        if (age >= 5 & city == "Agra") {

            System.out.println("The child is eligible for Adhar card");
        } else {
            System.out.println("The child is not eligible for Adhar card");
        }

        // FALSE & TRUE = FALSE :

        age = 17;
        city = "Pune";
        if (age >= 18 & city == "Pune") {

            System.out.println("The person can play the cricket");
        } else {
            System.out.println("The person not play the cricket");
        }

        // TRUE & FALSE = FALSE;

        age = 4;
        city = "Pune";
        if (age >= 5 & city == "Pune") {

            System.out.println("The child is eligible for Adhar card");
        } else {
            System.out.println("The child is not eligible for Adhar card");
        }

        // FALSE & FALSE = FALSE;

        age = 17;
        city = "Agra";
        if (age >= 18 & city == "Pune") {

            System.out.println("The person can play the cricket");
        } else {
            System.out.println("The person not play the cricket");
        }

        // TRUE & FALSE = FALSE;

        age = 4;
        city = "Agra";
        if (age >= 5 & city == "Pune") {

            System.out.println("The child is eligible for Adhar card");
        } else {
            System.out.println("The child is not eligible for Adhar card");
        }
    }
}

