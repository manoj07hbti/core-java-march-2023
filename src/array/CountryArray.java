package array;

public class CountryArray {
    public static void main(String[]args){

        String cont [] ={"INDIA","JAPAN","CHINA","PAKISTAN","RUSSIA","UKRAIN"};



        System.out.println("country array: "+cont[1]);

        // Advance for loop

        //syntax datatype variable name: arrayname{prin..code}
        for (String var:cont){
            System.out.println("country array using advance loop: "+var);
        }

        // for loop
        for (int i=0;i< cont.length;i++){
            System.out.println("string array for loop: "+cont[i]);
        }
        // while loop

        int i=0;
        while (i< cont.length){
            System.out.println("string array while loop: "+cont[i]);
            i++;
        }

        // do while loop
        i=0;
        do {
            System.out.println("string array do while loop: " + cont[i]);
            i++;
        }
        while (i< cont.length);
    }
}
