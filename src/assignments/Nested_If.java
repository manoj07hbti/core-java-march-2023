package assignments;

public class Nested_If {
    public static void main(String[] args) {

        // here we are applying nested if condition on children addmission eligibility
        int age;
        age = 4;// age should be 5 years for addmission
        if (age > 0) {
            if (age >= 5) {
                System.out.println("candidate eligible for primary education addmission");
            } else {
                System.out.println("candidate is not eligible for primary education addmission");
            }
            String id; //id is mandatory for addmission
            id = "ADHAR CARD";
            if (id == "ADHAR CARD") {
                if (age >= 5) {
                    System.out.println("candidate eligible for primary education addmission");
                } else {
                    System.out.println("candidate is not eligible without id for primary education addmission");

                }
            }

        }
    }
}

