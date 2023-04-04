package assignment;

public class ORoperator {
    public static void main(String[] args){
        int ram;
        String brand;

        // TRUE||TRUE = TRUE CONDITION

        ram=8;
        brand="IBM";
        if(ram>=8 || brand == "IBM"){
            System.out.println("GOOD CONFIGURATION");
        }else{
            System.out.println("NOT GOOD CONFIGURATION");
        }

        // TRUE || FALSE = TRUE
        ram=8;
        brand="infosys";
        if(ram>=8 || brand == "IBM"){
            System.out.println("GOOD CONFIGURATION");
        }else{
            System.out.println("NOT GOOD CONFIGURATION");
        }

        // false || true = TRUE
        ram=5;
        brand="IBM";
        if(ram>=8 || brand == "IBM"){
            System.out.println("GOOD CONFIGURATION");
        }else{
            System.out.println("NOT GOOD CONFIGURATION");
        }

        // false || false = false
        ram=3;
        brand="infosys";
        if(ram>=8 || brand == "IBM"){
            System.out.println("GOOD CONFIGURATION");
        }else{
            System.out.println("NOT GOOD CONFIGURATION");
        }
    }

}
