package collection_demo;

import java.util.ArrayList;

public class GenStringArrayList {
    public  ArrayList<String> craeteStringArraylist(){
        ArrayList<String> strArrayList=new ArrayList<>();

        strArrayList.add("BAREILLY");
        strArrayList.add("AGRA");
        strArrayList.add("PUNE");
        strArrayList.add("DELHI");
        strArrayList.add("NOIDA");
        strArrayList.add("BANGLORE");
        strArrayList.add("LONDON");
        strArrayList.add("LAS_VEGAS");

        return strArrayList;
    }

    public static void main(String[] args) {
        GenStringArrayList obj=new GenStringArrayList();
        ArrayList<String> output=obj.craeteStringArraylist();
        // apllied for loop
        for (int i=0;i<output.size(); i++){
            System.out.println("for loop " +output.get(i));
        }
        // applied while loop
        int j=0;
        while (j<output.size()){
            System.out.println(" while loop " +output.get(j));
            j++;
        }
        // applied do while loop
        int k=0;
        do {
            System.out.println("do while loop " +output.get(k));
            k++;
        }while (k<output.size());

        // advance for loop

        for (String var:output){
            System.out.println(" advance for loop " +var);
        }

    }
}

