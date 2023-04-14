package Array_Assigment;

public class Break_Loops {
    public static void main(String[] args) {

        // Break Loops assingment not get marks 28%;
        int marks[]={78,98,76,65,54,65};
        for (int var : marks){
            System.out.println("get number"+var+"marks");
            if (var<33){
                break;
            }

        }

        // Break loops Assignment not get marks 28%
         String subject[]={"maths","science","hindi","computer","sst"};
        for (String var:subject){
            System.out.println("subject"+var);
            if (var=="science"){
                break;

            }
        }


    }
}
