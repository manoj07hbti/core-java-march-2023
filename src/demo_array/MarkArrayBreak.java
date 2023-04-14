package demo_array;

public class MarkArrayBreak {
    public static void main(String[] args) {
        // Array of student marks;
        int students_marks[]={50,60,45,80,56,85,};
        for (int var:students_marks){
         if (var<45)  //check mark not less than 45
             break;
            System.out.println("printing java marks "+var);

        }
    }
}
