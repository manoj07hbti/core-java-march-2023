package my_conditional_statement;

public class MyNestedIf {
    public static void main(String[] args) {
       int marks;
       marks=33;
       if(marks>0){
           if(marks>=40);{
               System.out.println("Student cleared the exam");
           }
       }else{
           System.out.println("Student not cleared the exam");
       }
       marks=33;
       if(marks>45){
           if(marks>=40){
               System.out.println("Student cleared the exam");

           }
       }else{
           System.out.println("Student not cleared the exam");
       }

    }
}
