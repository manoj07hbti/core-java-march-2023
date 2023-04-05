package my_conditional_statement;

public class MyAndOperator {
    public static void main(String[] args) {
        int marks;
        String stream;
        // True and True=True
        marks = 65;
        stream = "science and art";
        if (marks >= 60 & stream == "science and art") {
            System.out.println("Students got 60% marks in science and art stream");
        } else {
            System.out.println("Student does not get 60% marks in science an art");
        }
//False and False=False
        marks = 55;
        stream = "science and art";
        if (marks >= 60 & stream == "science and art") {
            System.out.println("Students got 60% marks in science and art stream");
        } else {
            System.out.println("Student does not get 60% marks in science an art");
        }
//True and False=False
        marks = 65;
        stream = "math";
        if (marks >= 60 & stream == "science and art") {
            System.out.println("Students got 60% marks in science and art stream");
        } else {
            System.out.println("Student does not get 60% marks in science an art");
        }
        // False and False=False
        marks = 55;
        stream = "math";
        if (marks >= 60 & stream == "science and art") {
            System.out.println("Students got 60% marks in science and art stream");
        } else {
            System.out.println("Student does not get 60% marks in science an art");
        }
        //to check voter
        int age;
        String voter;
        //True &True=True
        age = 18;
        voter = "up";
        if (age >= 18 & voter == "up") {
            System.out.println("Person is eligible for voting");
        } else {
            System.out.println("Person is not eligible for voting");
        }
//FALSE AND TRUE =FALSE
        age = 12;
        voter = "up";
        if (age >= 18 & voter == "up") {
            System.out.println("Person is eligible for voting");
        } else {
            System.out.println("Person is not eligible for voting");
        }
        //TURE AND FALSE =FALSE
        age = 18;
        voter = "mp";
        if (age >= 18 & voter == "up") {
            System.out.println("Person is eligible for voting");
        } else {
            System.out.println("Person is not eligible for voting");
        }
        //FALSE AND FALSE=FALSE
        age = 11;
        voter = "mp";
        if (age >= 18 & voter == "up") {
            System.out.println("Person is eligible for voting");
        } else {
            System.out.println("Person is not eligible for voting");
        }

    }
    }
