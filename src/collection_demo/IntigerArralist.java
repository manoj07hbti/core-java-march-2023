package collection_demo;

import java.util.ArrayList;

public class IntigerArralist {
    public ArrayList<Integer> createIntigerArraylist(){

        //CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList<Integer> intigerarraylist=new ArrayList<>();

        intigerarraylist.add(432);
        intigerarraylist.add(585);
        intigerarraylist.add(906);
        intigerarraylist.add(99);
        intigerarraylist.add(456);
        intigerarraylist.add(577);

        return intigerarraylist;
    }

    public static void main(String[] args) {
        IntigerArralist obj=new IntigerArralist();
        ArrayList<Integer>output= obj.createIntigerArraylist();

        // applied advance for loop
        for (Integer var:output ){
            System.out.println("advance loop " + var);
        }
        // applied for loop
        for (int i=0; i<output.size();i++){
            System.out.println("for loop " + output.get(i));
        }
        // applied while loop
        int j=0;
        while (j<output.size()){
            System.out.println("while loop " +output.get(j));
            j++;
        }
        // applied do while loop
        int k=0;
        do {
            System.out.println(" do while loop " +output.get(k));
            k++;
        }while (k<output.size());

    }
}
