package Collection_Assignment;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_Double_String_value {
    public void Percentage(){
        HashMap<Double, String> Subject_Percentage = new HashMap<>();

        Subject_Percentage.put(298.00,"Math");
        Subject_Percentage.put(87.7,"Science");
        Subject_Percentage.put(876.54,"Moral Science");
        Subject_Percentage.put(765.65,"SST");


        Set<Double> keys= Subject_Percentage.keySet();
        for(Double var: keys){
            System.out.println("Printing in Map Double int "+Subject_Percentage.get(var));
        }
    }

    public static void main(String[] args) {
        Hashmap_Double_String_value obj=new Hashmap_Double_String_value();
        obj.Percentage();

    }
}
