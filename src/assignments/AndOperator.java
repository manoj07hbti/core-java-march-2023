package assignments;

public class AndOperator {
    public static void main(String[]args){
        // Syntax: minimum two variable or condition should be mandatory and we use multiple & operator according to need
        //  TRUE & TRUE = TRUE
        int marks_percent=65;
        String city="UP";
        if (marks_percent>=60 & city=="UP"){
            System.out.println("Student is eligible for apply in DU: TRUE & TRUE = TRUE");
        }else {
            System.out.println("Student is not eligible for apply in DU: TRUE & FALSE = FALSE");
        }
        // TRUE & FALSE = FALSE
         marks_percent=65;
         city="MP";
        if (marks_percent>=60 & city=="UP"){
            System.out.println("Student is eligible for apply in DU: ");
        }else {
            System.out.println("Student is not eligible for apply in DU: TRUE & FALSE = FALSE");
        }

        //  FALSE & TRUE = FALSE
        marks_percent=50;
        city="UP";
        if (marks_percent>=60 & city=="UP"){
            System.out.println("Student is eligible for apply in DU: ");
        }else {
            System.out.println("Student is not eligible for apply in DU:  FALSE & TRUE = FALSE");
        }
        //  FALSE & FALSE = FALSE
        marks_percent=55;
        city="HP";
        if (marks_percent>=60 & city=="UP"){
            System.out.println("Student is eligible for apply in DU: ");
        }else {
            System.out.println("Student is not eligible for apply in DU: FALSE & FALSE = FALSE");
        }






    }


}
