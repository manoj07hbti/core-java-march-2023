package array;

public class MarksArray_break {
    public static void main(String[]args){
        // array of student marks

        int students_marks []={40,50,35,32,59,49};

        for (int var:students_marks){
            if (var<33)// check marks not less than 33
                break;
            System.out.println("Printing Java Developer course "+var);
        }
    }
}
