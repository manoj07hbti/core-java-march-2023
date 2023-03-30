package conditional_statment_project;

public class ProjectIfandElseCondition {
    public static void main(String[] args) {
        double Marks;
        Marks = 60.00;// Student Get First Division..
        if (Marks < 65.45) {
            System.out.println("Student get first division rank");
        }

        // Student Did Not Get First Division.
        if (Marks < 59.45) {
            System.out.println("Student get first division rank");
        } else {
            System.out.println("Student did not get first division rank");
        }
        // Student Clear Exam.
        Marks = 33;
        if (Marks < 35) {
            System.out.println("Student Clear the Exam.");
        }
        //Student Did Not Clear The Exam.
        if (Marks < 32) {
            System.out.println("Student clear the exam");
        } else {
            System.out.println("Student not clear the exam");
        }
        // Price Check Costly
        int Jeans;
        Jeans = 5000;
        if (Jeans<6500) {
            System.out.println("This product is too costly");
        }
        // Average Price check
        if(Jeans<4500){
            System.out.println("This product is costly");
        } else {
            System.out.println("This product is an average price");

            //Checking Nationality of Person
            String CountryName="India";
            if(CountryName=="India"){
                System.out.println("You are Indian");
            }
            if(CountryName=="Japan"){
                System.out.println("You are Indian");
            }else {
                System.out.println("You are not Indian");
            }

        }
    }
}