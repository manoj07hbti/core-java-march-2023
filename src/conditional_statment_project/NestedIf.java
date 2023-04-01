package conditional_statment_project;

public class NestedIf {
    public static void main(String[] args) {
     // Nested If First Condition use- where Student Passed

        int Marks = 33;
        if (Marks>0) {

            if (Marks<37) {
                System.out.println("Student Passed in Exam..");
            } else {
                System.out.println("Student Did not Passed in Exam..");
            }
        } else {
            System.out.println(" Please enter the Valid Marks of Student..");
        }

        // Nested if Second Condition use- where Student Not Passed

        if(Marks>0){

            if(Marks<32){
                System.out.println("Student Passed In Exam..");

            }else{
                System.out.println("Studen Did Not Passed in Exam..");
            }
    }else{
            System.out.println("Please Enter the Valid Marks of Student..");
        }

        // Example 2 Using Nested If Condition--
        // Checking Price is in Budget or Not.

        int Product=5000;

        if(Product>0){

            if(Product<6000){
                System.out.println("This Product is Very Costly..");
            }else {
                System.out.println("This Prduct is on Average Price..");
            }

        }else {
            System.out.println("Plase enter the Valid Product Amount");
        }

        //Checking Price in Budgent or Not..
        if(Product>0){

            if(Product>4000){
                System.out.println("Tjis Product is on Average Price..");
            }else {
                System.out.println("This Product is Very Costly..");
            }
        }else {
            System.out.println("Please Enter the Valid Amount of Product..");
        }
}
    }


