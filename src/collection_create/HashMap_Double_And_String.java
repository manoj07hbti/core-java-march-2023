package collection_create;

import java.util.HashMap;

public class HashMap_Double_And_String {

    public void salary(){

        HashMap<Double,String> sub_salary = new HashMap<>();

        sub_salary.put(8952.25,"Aman");
        sub_salary.put(95846.50,"Ram");
        sub_salary.put(98500.80,"Komal");
        sub_salary.put(80580.70,"lovely");
        sub_salary.put(70500.60,"Hari Mohan");

        // reading value from course : map.get(KEY);
        System.out.println("printing hashmap: " +sub_salary  .get("8952.25"));
        for (Double var:sub_salary  .keySet()) {
            System.out.println("printing hashmap using loop: " +sub_salary .get(var));
        }
    }
    public static void main(String[] args) {
        HashMap_Double_And_String  obj=new  HashMap_Double_And_String ();
        obj.salary();
    }

    }

