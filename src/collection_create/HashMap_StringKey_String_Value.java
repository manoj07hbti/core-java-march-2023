package collection_create;

import java.util.HashMap;

public class HashMap_StringKey_String_Value {

    public void createHashMap(){

        // CAPITALS AND COUNTRY
        HashMap<String,String>CapitalsHashMap = new HashMap<>();

        CapitalsHashMap.put("India"," New Dehli");
        CapitalsHashMap.put("Australia","Canberra");
        CapitalsHashMap.put("China","Beijing");
        CapitalsHashMap.put("Colombia","Bogota");
        CapitalsHashMap.put("Italy","Rome");
        CapitalsHashMap.put("Japan","Tokyo");
        CapitalsHashMap.put("Kenya","Nairobi");
        CapitalsHashMap.put("Mexico","Mexico city");
        CapitalsHashMap.put("Nigeria","Abuja");
        CapitalsHashMap.put("Pakistan","Islamabad");

        // reading value from course : map.get(KEY);
        System.out.println("printing hashmap: " + CapitalsHashMap.get("india"));
        for (String var:CapitalsHashMap  .keySet()) {
            System.out.println("printing hashmap using loop: " + CapitalsHashMap .get(var));
        }
    }

    public static void main(String[] args) {
        HashMap_StringKey_String_Value obj=new  HashMap_StringKey_String_Value();
        obj.createHashMap();
    }

    }

