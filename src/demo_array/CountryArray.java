package demo_array;

public class CountryArray {
    public static void main(String[] args) {

        String country[]={"India","Bhutan","America","New Zealand","Pakistan","Kenya","Japan","Peru","Spain"};

        System.out.println("printing data:"+country[0]);

        // for loop;

        for (int i=0;i<country.length;i++) {
            System.out.println("Printing array with loop:" + country[i]);

        }
        // while loop;
        int i = 0;
        while (i<country.length) {
            System.out.println("Printing array with while loop" + country[i]);
            i++;
        }
        // Do while loop
        i=0;
        do {
            System.out.println("Printing array with do while loop" + country[i]);
            i++;
        }
        while (i<country.length);


        }

        }


