package demo_array;

public class DemoArray {

    public static void main(String[] args) {

        String city1="Agra";
        String city2="Delhi";
        String city3="Jaipur";
        String city4="Kanpur";
        String city5="Bangalore";
    //Datatype varName [] = {value1, value2,value3.......value N};

        String cities []={"Agra","Delhi","Jaipur","Kanpur","Bangalore","Pune","Bhopal"};

    // printing array element based on index  varName[INDEX];

        System.out.println("Printing data: "+ cities[0]);

    // printing all element of array

        for (int i=0; i<cities.length; i++){

            System.out.println("Printing with loop "+cities[i]);
        }

        //SYNTAX: for (Datatype varName : arrayName){
        //              //CODE
        //            }

        for (String var : cities){

            System.out.println("Printing in Advanced for loop "+var);
        }

        //Datatype varName [] = {value1, value2,value3.......value N};
    int marks [] = {34,76,34,67,87,23,45,65,86,45,98};

        for(int i=0; i < marks.length; i++ ){

            System.out.println("Printing marks : "+marks[i]);
        }

        for(int var: marks){

            System.out.println("Printing using advanced loop "+var);
        }

     double prices[] ={2321.34,4543.324,565.32, 655.3,56,766.8};
       int j=0;

        for(double var : prices){

            System.out.println("printing in advanced loop "+var+ " at Index "+j);
            j++;
        }

        for (int i=0; i<prices.length; i++){
            System.out.println("Printing prices "+prices[i]);
        }

    }
}
