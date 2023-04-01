package conditional_statment_if;

public class ProjectIfCondition {
    public static void main(String[]args){
        double Marks;
        Marks =60.00;//Student First Division.
        if (Marks <62.22){
            System.out.println("Student Rank In The Class First Division..");

            Marks=33.35;//Student is Not clear Exam...
            if (Marks >31.15){
                System.out.println("Student is Not clear exam...");

                int clothes;
                clothes=5000;//Checking product is costly/Not..
                if (clothes<6000){
                    System.out.println("This product is costly");


                    clothes=4000;
                    if (clothes>3000){
                        System.out.println("This product is of limited price");


                        String CountryName;
                        CountryName="India";//Checking is this person from india or not...
                        if (CountryName=="India"){
                            System.out.println("You are Indian");

                        }

                    }

                }

            }

        }

    }

}
