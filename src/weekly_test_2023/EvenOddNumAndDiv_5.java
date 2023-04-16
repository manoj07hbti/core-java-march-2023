package weekly_test_2023;

import java.util.jar.JarEntry;

public class EvenOddNumAndDiv_5 {

    public static void main(String []args){
        int j=123; // initialn value
        while(j<=234){
            if (j%5==0){
                if (j%2==0){
                    System.out.println("this number is Even and also div by 5:"+j);

                }else
                    System.out.println("this number is Odd and also div by 5:"+j);

            }
            j++;
        }
    }
}
