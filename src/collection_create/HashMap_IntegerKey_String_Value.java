
package collection_create;

import java.util.HashMap;

public class HashMap_IntegerKey_String_Value {

    public void createStringHashMap() {

        // key,(1..8) String(country)
        HashMap<Integer, String> CourseHashMap = new HashMap<>();

        CourseHashMap.put(1, "India");
        CourseHashMap.put(2, "China");
        CourseHashMap.put(3, "Pakistan");
        CourseHashMap.put(4, "Russia");
        CourseHashMap.put(5, "Japan");
        CourseHashMap.put(6, "Brazil");
        CourseHashMap.put(7, "Bangladesh");
        CourseHashMap.put(8, "France");
        // reading value from course : map.get(KEY);
        System.out.println("printing hashmap: " + CourseHashMap.get("1"));

        for (Integer var: CourseHashMap.keySet()) {
            System.out.println("printing hashmap using loop: " + CourseHashMap.get(var));
        }
    }
    public static void main(String[] args) {
        HashMap_IntegerKey_String_Value obj = new HashMap_IntegerKey_String_Value();
        obj.createStringHashMap();

    }
}