package collection_demo;

import java.util.HashSet;

public class StringHashset {
    public void createStringHashset(){
        HashSet<String> str=new HashSet<>();

        str.add("pragati");
        str.add("madhavi");
        str.add("arohi");
        str.add("prem");
        str.add("java");
        str.add("python");
        str.add("kotlin");
        str.add("C++");


        for (String var:str){
            System.out.println("advance for loop "+var);
        }

    }

    public static void main(String[] args) {
        StringHashset obj=new StringHashset();
        obj.createStringHashset();

    }
}
