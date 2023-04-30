package conditional_statement;

public class OrOperatorIfElse {

    public static void main(String[] args) {
         /* 1.   TRUE  || TRUE = TRUE    1+1= 1
            2.   TRUE  || FALSE= TRUE    1+0= 1
            3.   FALSE || TRUE=  TRUE    0+1= 1
            4.   FALSE || FALSE= FALSE   0+0= 0*/


//1.   TRUE  || TRUE = TRUE    1+1= 1


        int age=18;
        String name="khushboo";

        if (age>=18 || name=="khushboo"){
            System.out.println("khushboo is a younger girl");

        }else {
            System.out.println("khushboo is a child");
        }

        // 2.   TRUE  || FALSE= TRUE    1+0= 1

        int salary=50000;
        String city="Agra";

        if (salary<=50000 ||city == "pune"){

            System.out.println("if employee salary is 50000 then they can live in pune");
        }
        else {
            System.out.println("if employee salary is less then 50000 then they can not live in pune");
        }


        //3.   FALSE || TRUE=  TRUE    0+1= 1

        String City = "firozabad";
        String girl = "priyanka";
        if (City == "Agra"|| girl == "Priyanka") {

            System.out.println("Priyanka belongs to Firozabad");
        } else {
            System.out.println("Priyanka is not belongs Firozabad");
    }

        // 4.   FALSE || FALSE= FALSE   0+0= 0

        double marks = 75.6;
        String student = "Raj";
        if (marks > 70 || student == "Rahul") {
            System.out.println("Rahul passed with first division");
        } else {
            System.out.println("Rahul failed ");
        }
}
}
