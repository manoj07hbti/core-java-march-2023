package myarray;

import javax.sql.rowset.serial.SQLOutputImpl;

public class DemoArray {
    public static void main(String[] args) {
String country1="India";
String country2="usa";
String country3="Africa";
String country4="Australia";
String country5="England";
        //Datatype varName [] = {value1, value2,value3.......value N};
        String countries []={"India","usa","Africa","Australia","England"};

// printing array element based on index  varName[INDEX];


        System.out.println("Printing data: "+ countries[0]);

        // printing all element of array

        for (int i=0; i<countries.length; i++){

            System.out.println("Printing with loop "+countries[i]);
        }
    }
}
