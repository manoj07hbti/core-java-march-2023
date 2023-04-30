package conditional_statement;

public class AndOperatorIfElse {

    /*1.   TRUE & TRUE = TRUE     1*1= 1
     2.   TRUE & FALSE= FALSE    1*0= 0
     3.   FALSE & TRUE= FALSE    0*1= 0
     4.   FALSE & FALSE= FALSE   0*0= 0*/
    public static void main(String[] args) {

        int age = 18;
        String name = "khushboo";
        if (age >= 18 & name == "khushboo") {
            System.out.println("khushboo is eligible for the voting");
        } else {
            System.out.println("khushboo is not eligible for the voting");
        }

        int Age = 10;
        String Name = "khushboo";
        if (Age >= 18 & Name == "Khushboo") {
            System.out.println(" Khushboo is elder girl ");
        } else {
            System.out.println("Khushboo is child boy ");
        }

        String city = "firozabad";
        String girl = "anushka";
        if (city == "Agra" & girl == "Priyanka") {

            System.out.println("Priyanka belongs to Firozabad");
        } else {
            System.out.println("Priyanka is not belongs Firozabad");
        }
        double marks = 75.6;
        String student = "Raj";
        if (marks > 70 & student == "Rahul") {
            System.out.println("Rahul passed with first division");
        } else {
            System.out.println("Rahul failed ");
        }

    }
}
