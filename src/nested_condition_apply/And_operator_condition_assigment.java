package nested_condition_apply;

public class And_operator_condition_assigment {
    public static void main(String[] args) {

        //  PROJECT-1 Condition===True+True=True

        int science_marks;
        String stream;

        science_marks=60;
        stream ="science";

        if (science_marks<65 & stream=="science"){
            System.out.println("student 60% in stream science");
        }else {
            System.out.println("student did not 60% in stream science");
        }

        // Condition===True+False=False

        int Arts_marks;
        Arts_marks=59;
        stream="arts";

        if (Arts_marks<55 & stream=="Arts"){
            System.out.println("student 60% in stream science");
        }else {
            System.out.println("student  did not 60% in stream science");
        }

        // Condition==False+True=False
         int commerace_marks=60;

        int  commerace_marks_=60;
        stream="science";

        if (commerace_marks<55 & stream=="science"){
            System.out.println("student 60% in stream science");
        }else {
            System.out.println("student  did not 60% in stream science");
        }

        // Condition===False+False=False

        int Math_marks=60;
        stream="science";

        if (Math_marks<55 & stream=="science"){
            System.out.println("student 60% in stream science");
        }else {
            System.out.println("student  did not 60% in stream science");
        }


        // PROJECT 2 Eligible voting and State
        // Condition==True+true=True

        int age;
        String State;

         age=19;
         State="Up";
         if (age>=17 & State=="up"){
             System.out.println("Candidate eligible for voting in state");
         }else {
             System.out.println("candidate not eligible for voting in state");
         }


         // Condition==True+False=False

        age=18;
         State="mp";
         if (age<14 & State=="mp"){
             System.out.println("Candidate eligible for voting in state");
         }else {
             System.out.println("candidate not eligible for voting in state");
         }

         // Condition==False+True=False

        age=18;
         State="Uk";
         if (age<15& State=="Uk"){
             System.out.println("Candidate eligible for voting in state");
         }else {
             System.out.println("candidate not eligible for voting in state");
         }


         // Condition==False+False=False

        age=19;
         State="Ch";
         if (age<16 & State=="Ch"){
             System.out.println("Candidate eligible for voting in state");
         }else {
             System.out.println("candidate not eligible for voting in state");
         }








    }




}