package weekly_test_16_april;

public class Project_2 {
    //Write a program to calculate percentage of any number and
    // it will also identify whether calculated % is between 10 to 30
    public static void main(String[] args) {
        //int total;
        //total=100;
        int marks;
        marks=24;
        //int percentage;
        //percentage=total/marks;
        //System.out.println("Scored Marks :- "+ percentage);
        if(marks>10 & marks<30){
            System.out.println("calculated % is between 10 to 30"+" Scored Marks:- "+ marks);
        }else {
            System.out.println("calculated % is not between 10 to 30");
        }
    }
}

