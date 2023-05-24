package collection_demo;

import java.util.HashMap;
import java.util.Set;

public class HashMapIntAndStringValue {
    public void CreateHashMap(){
        //HashMap <DataType_Key, DataType_Value> objName= new HashMap();
   HashMap<Integer, String> HashMaps=new HashMap<>();
        //adding value :  map.put(key,value);
     HashMaps.put(1, "raj");
     HashMaps.put(2, "kamini");
     HashMaps.put(3, "ram");
        HashMaps.put(1, "raj");
        HashMaps.put(2, "kamini");

        // reading value from course : map.get(KEY);
        System.out.println("print Hashmap: "+HashMaps.get(2));

        // how to iterate or traverse hashMap  map.keySet();
        Set<Integer> keys=  HashMaps.keySet();

        for(Integer var:keys) {
            System.out.println("printing map using loop: "+HashMaps.get(var));
        }
        // map.remove(key);
HashMaps.remove(2);
        for(Integer var:keys){
            System.out.println("after removing printing hashmap: "+HashMaps.get(var));
        }

    }

    public static void main(String[] args) {
        HashMapIntAndStringValue obj=new HashMapIntAndStringValue();
        obj.CreateHashMap();
    }

}
