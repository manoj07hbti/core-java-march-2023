package Array;

public class AdvanceLoop {
    public static void main(String[] args) {
        int marks[]={45,48,88,65,59,32,58,95,99,100,78,25};

        //SYNTAX: for(datatype varName : arrayname){
        //         CODE
        //         }

        for(int var:marks){
            System.out.println("printing in advance for loop MARKS : " +var);
        }

        // advance for loop height
        double height[] = {14.56,45.54,26.78,25.12,152.48,45.23,15.66,485.55,123.45,78.41,45.51};
        for(double var:height){
            System.out.println("printing in advance for loop HEIGHT : " +var);
        }

        // advance for loop distance
        double distance[] = {458.44, 4878.77, 789.88, 784577.99, 145.88, 659.23, 6784595.77};
        for(double var:distance){
            System.out.println("printing in advance for loop DISTANCE : " +var);
        }



    }
}

