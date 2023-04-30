package loop;

public class ContinueWithLoops {

    public static void main(String[] args) {


        String arr[] = {"HINDI", "English", "Math", "History"};

        for (String var : arr) {
            if (var.equals("Math")) {
                continue;
            }
            System.out.println(" print loop.."+var);
        }

        // continue with int

        int marks []={45,76,56,98,34,65};
        for (int var : marks){
            if (var==45){
                continue;
            }
            System.out.println("print marks with continue..."+var);
        }


    }
}
