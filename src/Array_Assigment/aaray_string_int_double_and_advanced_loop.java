package Array_Assigment;

import jdk.nashorn.internal.ir.CallNode;

public class aaray_string_int_double_and_advanced_loop {

    public static void main(String[] args) {

        // Data Type String for loop;

        String city1="Lucknow";
        String city2="Mumbai";
        String city3="Tundla";
        String city4="Etmadpur";
        String cities[]={"Lucknow","Mumbai","Tundla","Etamadpur"};
        for (int m=0; m<cities.length; m++) {
            System.out.println("printing all cities" + cities[m]);
        }
        String clases[]={"first","second","third"};
        for (int g=0; g<clases.length; g++){
            System.out.println("printing all classes"+clases[g]);
        }
        String Format[]={"account","accountant","tally"};
        for (int y=0; y<Format.length;y++){
            System.out.println("printing all Format"+Format[y]);
        }

        // Data type Int for loop;

        int Distances []={44,76,98,98,76,89};
        for (int l=0; l<Distances.length;l++) {
            System.out.println("printing all Distances"+Distances[l]);
        }

        int fire[]={76,76,89,787,87};
        for (int f=0; f<fire.length;f++){
            System.out.println("printing all fire"+fire[f]);
        }

        int sub[]={45,9,87,65};
        for (int e=0; e<sub.length;e++){
            System.out.println("printing all sub"+sub[e]);
        }


        //Data type Double Array for loop ;
        double quite[]={4.66,7.98,8.99,1.88};
        for (int s=0; s<quite.length; s++)
        {
            System.out.println("printing all double"+s+" "+quite[s]);
        }
        double eight[]={567.8,456.7,5667.7};
        for (int u=0; u<eight.length;u++){
            System.out.println("all printing eight"+eight[u]);
        }
        double otp[]={44.7,889.0,345.99};
        for (int d=0; d<otp.length;d++){
            System.out.println("all printing otp"+otp[d]);
        }

        // String in Advanced Loop//;
        for (String var : cities){
            System.out.println("printing all cities:"+var);
        }
        for (String var : clases){
            System.out.println("printing all classes:"+var);
        }
        for (String var : Format){
            System.out.println("printing all Format:"+var);
        }
        // Int in Advanced Loop//;
        for (int var : Distances){
            System.out.println("printing all distances:"+var);
        }
        for (int var : fire){
            System.out.println("printing all fire "+var);
        }
        for (int var : sub){
            System.out.println("printing all sub "+var);
        }
        // Double Array in Advanced loops//;

        for (double var : quite){
            System.out.println("printing all quite "+var);
        }
        for (double var :eight){
            System.out.println("printing all eight "+var);
        }
        for (double var :otp){
            System.out.println("printing all otp "+var);
        }



    }






    }

