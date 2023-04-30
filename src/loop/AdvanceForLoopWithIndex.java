package loop;

public class AdvanceForLoopWithIndex {
    public static void main(String[] args) {

        String countries[] ={"India","Japan","USA","london","paris"};
        int i =0;

        for ( String var : countries){
            i++;
            System.out.println(" print countries .."+  i +"  " +   var);
        }
        int distens []={76,87,56,90,79,37};
        int j=0;
        for (int var : distens){
            j++;
            System.out.println("print distense at index.."+j+" index is "+var);
        }
        double price[]={67.8,56.9,36.9,23.7,};
        int k=0;
        for (double var: price){
            k++;
            System.out.println(" product price is.."+var+ "  on index.."+k);
        }

    }
}
