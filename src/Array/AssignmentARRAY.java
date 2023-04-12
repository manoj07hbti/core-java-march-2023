package Array;

public class AssignmentARRAY {
    public static void main(String[] args) {

        //assigning value in string array
        String city[] = {"delhi", "mumbai", "bihar", "lucknow", "sonipat", "bhopal", "agra", "kanpur"};
        System.out.println("printing array data : " + city[5]);

        //printing all element of array
        for (int i = 0; i < 5; i++) {
            System.out.println("printing the loop of all element of array " + city[i]);
        }

        //printing all element of array with length

        for (int i = 0; i < city.length; i++) {
            System.out.println("printing the loop of all element of array with length " + city[i]);
        }

        // array for countries
        String country[] = {"india", "uk", "us", "china", "japan", "korea", "nepal"};
        for (int i = 0; i < country.length; i++) {
            System.out.println("array for countries : " + country[i]);
        }

        // array for distance
        double distance[] = {458.44, 4878.77, 789.88, 784577.99, 145.88, 659.23, 6784595.77};
        for (int i = 0; i < distance.length; i++) {
            System.out.println("array for distance : " + distance[i]);
        }

        // array for height
        double height[] = {14.56,45.54,26.78,25.12,152.48,45.23,15.66,485.55,123.45,78.41,45.51};
        for (int i = 0; i<height.length; i++) {
            System.out.println("array for height : " + height[i]);
        }




    }
}

