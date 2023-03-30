package conditional_statment_project;

public class ProjectIfCondition {
    public static void main(String[] args) {
        double Marks;
        Marks = 60.00;// Student Get first Division.
        if (Marks < 62.22) {
            System.out.println("Student Rank In Class First Division..");


            Marks = 33.22;//  Student Not Clear Exam Code.
            if (Marks > 31.23) {
                System.out.println("Student Not clear Exam...");

                int Jeans;
                Jeans=5000;// Checking Product is Costly/Not.
                if (Jeans<6000) {
                    System.out.println("This Product is Too Costly");

                    String CountryName;
                    CountryName="India";// Checking Nationality of Person.
                    if(CountryName=="India"){
                        System.out.println("You are Indian");

                    }
                }


            }
        }

    }
}