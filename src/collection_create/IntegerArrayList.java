package collection_create;

import java.util.ArrayList;

public class IntegerArrayList {
    public ArrayList<Integer> createIntegerArrayList() {

        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<Integer> intigerarraylist = new ArrayList<>();

        intigerarraylist.add(564);
        intigerarraylist.add(8564);
        intigerarraylist.add(2358);
        intigerarraylist.add(4778);
        intigerarraylist.add(4558);
        intigerarraylist.add(8574);
        intigerarraylist.add(654);
        intigerarraylist.add(625);
        intigerarraylist.add(575);
        intigerarraylist.add(666);

        return intigerarraylist;
    }

    public static void main(String[] args) {
        IntegerArrayList obj=new  IntegerArrayList();
        ArrayList<Integer>output= obj.createIntegerArrayList();
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
        // appl .do while loop
        int k=0;
        do {
            System.out.println(" do while loop " +output.get(k));
            k++;
        }while (k<output.size());

    }
}





