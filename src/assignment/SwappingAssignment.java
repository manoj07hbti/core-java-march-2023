package assignment;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

public class SwappingAssignment {
    public static void main(String[] args){
        //program for swapping two number without third variable
        int a=50;
        int b=200;
        System.out.println("a ="+a +" b = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping");
        System.out.println("a = "+a + " b = "+b);
    }

}
