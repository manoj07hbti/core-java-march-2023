package collection_demo;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GenerictypeDoubleArrayList {

    public ArrayList<Double> createdoubleArraylist(){

        ArrayList<Double> doublearraylist=new ArrayList<>();

        doublearraylist.add(46.77);
        doublearraylist.add(88.77);
        doublearraylist.add(46.77);
        doublearraylist.add(88.77);
        doublearraylist.add(46.77);
        doublearraylist.add(88.77);

        return doublearraylist;
    }

    public static void main(String[] args) {
        GenerictypeDoubleArrayList obj=new GenerictypeDoubleArrayList();
        ArrayList<Double> output =obj.createdoubleArraylist();

        // for loop
        int i;
        for (i=0;i<output.size();i++){
            System.out.println("for loop " +output.get(i));
        }
        // while loop
        i=0;
        while (i<output.size()){
            System.out.println(" while loop " +output.get(i));
            i++;
        }
        // do while loop
        int j=0;
        do {
            System.out.println(" do while loop " +output.get(j));
            j++;
        }while (j<output.size());
        // advance for loop
        for (Double var:output){
            System.out.println(" advance for loop " + var);
        }
    }


}
