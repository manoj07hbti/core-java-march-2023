package collection;

import java.util.ArrayList;

public class DemoArraylist {
    public void createArraylist(){
        ArrayList list=new ArrayList();

        list.add("INFOSYS");// 0 INDEX
        list.add("Genpact"); // 1 INDEX
        list.add("TCS"); // 2 INDEX
        list.add("JAVA");
        list.add("C++");
        list.add("PYTHON");
        list.add("COTLIN");
        list.add("C+");
        list.add("james gosling");
        list.add("Byte code");

        System.out.println(list.get(0));
        System.out.println(list.get(1));



        // using for loop
        System.out.println("used for each loop");

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i) + " at index " + i);
        }
        // used while loop
        System.out.println("used while loop");

        int i=0;
        while (i<list.size()){
            System.out.println(list.get(i) + " at index " + i);
            i++;
        }

    }

    public static void main(String[] args) {
        DemoArraylist obj=new DemoArraylist();
        obj.createArraylist();
    }
}
