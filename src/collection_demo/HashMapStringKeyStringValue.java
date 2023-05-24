package collection_demo;

import java.util.HashMap;

public class HashMapStringKeyStringValue {
    public void createStringHashMap() {
        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();
        HashMap<String, String> stringHashMap = new HashMap<>();
        //adding value :  map.put(key,value);

        stringHashMap.put("a", "ram");
        stringHashMap.put("b", "rajesh");
        stringHashMap.put("c", "radha");
        // reading value from course : map.get(KEY);
        System.out.println("printing hashmap: " + stringHashMap.get("a"));
        // how to iterate or traverse hashMap  map.keySet();
        for (String var : stringHashMap.keySet()) {
            System.out.println("printing hashmap using loop: "+stringHashMap.get(var));
        }
        // map.remove(key);

        }


    public static void main(String[] args) {
        HashMapStringKeyStringValue obj=new HashMapStringKeyStringValue();
        obj.createStringHashMap();
    }
}
