package assignment;

public class AndCondition {
    public static void main(String[] args) {
        int marks;
        String stream;

        // TRUE & TRUE = TRUE

        marks = 60;
        stream = "science";
        if (marks == 60 & stream == "science") {
            System.out.println("60% IN SCIENCE STREAM");
        }else{
            System.out.println("YOU ARE NOT FROM SCIENCE STREAM");
        }

        // TRUE & FALSE

        marks=60;
        stream = "arts";
        if (marks == 60 & stream == "science") {
            System.out.println("60% IN SCIENCE STREAM");
        }else{
            System.out.println("YOU ARE NOT FROM SCIENCE STREAM");
        }

        // FALSE AND TRUE

        marks=10;
        stream="science";
        if (marks == 60 & stream == "science") {
            System.out.println("60% IN SCIENCE STREAM");
        }else{
            System.out.println("NOT ACHIEVED 60% IN SCIENCE STREAM");
        }

        //FALSE AND FALSE

        marks = 10;
        stream = "arts";
        if (marks == 60 & stream == "science") {
            System.out.println("60% IN SCIENCE STREAM");
        }else{
            System.out.println("YOU ARE NOT FROM SCIENCE STREAM");
        }

        // ELIGIBLE VOTING

        int age;
        String state;

        //TRUE & TRUE

        age= 25;
        state="UP";
        if(age>=18 & state=="UP"){
            System.out.println("THE PERSON IS ELIGIBLE FOR VOTING");
        }else{
            System.out.println("THE PERSON IS NOT ELIGIBLE FOR VOTING");
        }

        // TRUE AND FALSE
        age= 25;
        state="MP";
        if(age>=18 & state=="UP"){
            System.out.println("THE PERSON IS ELIGIBLE FOR VOTING");
        }else{
            System.out.println("THE PERSON IS NOT ELIGIBLE FOR VOTING");
        }

        // FALSE AND TRUE
        age= 12;
        state="UP";
        if(age>=18 & state=="UP"){
            System.out.println("THE PERSON IS ELIGIBLE FOR VOTING");
        }else{
            System.out.println("THE PERSON IS NOT ELIGIBLE FOR VOTING");
        }

        // FALSE AND FALSE
        age= 12;
        state="MAHARASHTRA";
        if(age>=18 & state=="UP"){
            System.out.println("THE PERSON IS ELIGIBLE FOR VOTING");
        }else {
            System.out.println("THE PERSON IS NOT ELIGIBLE FOR VOTING");
        }

    }
}

