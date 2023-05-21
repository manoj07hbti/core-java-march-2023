package collection_create;

import java.util.HashSet;

public class Demo_Hashset {

    public void StringHashset(){
        HashSet<String> course =new HashSet<>();

            course.add("Wendy");
            course.add("Lovely");
            course.add("Wendy");
            course.add("Santy");
            course.add("Mahajan");
            course.add("Wendy");
            course.add("Ram");

            System.out.println("printing size"+course.size());

            for (String var : course) {
                System.out.println("print string " + var);
            }
        }

        public void IntegerHashset() {
            HashSet<Integer> roll_no = new HashSet<>();
            roll_no.add(436);
            roll_no.add(802);
            roll_no.add(436);
            roll_no.add(836);
            roll_no.add(802);

            for (Integer var : roll_no) {
                System.out.println("print integer " + var);
            }
        }

        public void DoubleHashset() {
            HashSet<Double> expanses = new HashSet<>();
            expanses.add(23.25);
            expanses.add(50.5);
            expanses.add(23.25);
            expanses.add(95.45);
            expanses.add(56.20);
            for(Double var: expanses){
                System.out.println("print double "+var);
            }
        }

        public static void main(String[] args) {
            Demo_Hashset obj = new Demo_Hashset();
            obj.StringHashset();
            obj.IntegerHashset();
            obj.DoubleHashset();
        }
    }

