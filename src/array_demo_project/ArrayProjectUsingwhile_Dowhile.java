package array_demo_project;

public class ArrayProjectUsingwhile_Dowhile {
    public static void main(String[] args) {

        // Using While loop for Printing Array Data:-==========================================
        String Country[] = {"India", "Japan", "USA", "South Africa"};
        int i = 0;
        while (i < Country.length) {
            System.out.println("Printing Country Name" + " = " + Country[i]);
            i++;
        }

        // Using Do While loop for Printing Array Data:-========================================
        int Distance[] = {15, 14, 19, 22, 36, 45};
        int j = 0;
        do {
            System.out.println("Printing Distance" + " = " + Distance[j] + " K.m");
            j++;
        } while (j < Distance.length);

        // Using Advance While loop for Printing Array Data:-=====================================
        // }
        for (int var : Distance) {
            System.out.println("Printing Distanace" + "=" + var);
        }
    }
}

