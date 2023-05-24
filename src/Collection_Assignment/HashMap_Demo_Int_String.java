package Collection_Assignment;

import java.util.HashMap;
import java.util.Set;

public class HashMap_Demo_Int_String {
    public void CreateHashMap(){
        HashMap<Integer,String> map=new HashMap<>();
        // Integer key and String value

        map.put(1,"Mayank");
        map.put(2,"Golu");
        map.put(3,"Satish");
        map.put(4,"Surendra");

        // Map Set.keys
        Set<Integer> keys= map.keySet();

        for (Integer var: keys){
            System.out.println("printing Map "+map.get(var));

        }

    }

    public static void main(String[] args) {
        HashMap_Demo_Int_String obj=new HashMap_Demo_Int_String();
        obj.CreateHashMap();
    }

}
