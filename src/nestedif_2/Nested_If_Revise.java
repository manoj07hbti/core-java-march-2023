package nestedif_2;

public class Nested_If_Revise {

    public static void main(String[] args) {

        int age;
        age = 6;
        if (age > 0) ;
        {

            if (age >= 5) {
                System.out.println("The child is eligible for admission.");
            } else {
                System.out.println("The child is not eligible for admission");
            }

            String city;
            city = "Tundla";

            if (city == "Agra") {
                if (age >= 5) {

                    System.out.println("The child is eligible for admission Tundla");
                } else {
                    System.out.println("The child is not eligible for admission");
                }
            } else {
                System.out.println("Only admission for Tundla students");


                int marks;
                marks = 33;
                if (marks > 0) {
                    if (marks >= 40) ;
                    {
                        System.out.println("Student cleared the exam");
                    }
                } else {
                    System.out.println("Student not cleared the exam");
                }
            }
        }
    }
}