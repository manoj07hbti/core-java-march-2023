package Collection_Assignment;

import java.util.HashMap;
import java.util.Set;

public class Hashmap_String_key_String_value_coolection {
    public void cities(){
        HashMap<String, String> CitiesHashmap = new HashMap<>();

        CitiesHashmap.put("Agra", "Rambhag");
        CitiesHashmap.put("Delhi", "Rohini");
        CitiesHashmap.put("Pune", "Sonipat");
        CitiesHashmap.put("Sabarmati","Rudrapur");


        Set<String> keys= CitiesHashmap.keySet();
        for(String var: keys){

            System.out.println("Printing Map in String: "+CitiesHashmap.get(var));
        }
    }
    public static void main(String[] args){
        Hashmap_String_key_String_value_coolection obj=new Hashmap_String_key_String_value_coolection();
        obj.cities();
    }
}


