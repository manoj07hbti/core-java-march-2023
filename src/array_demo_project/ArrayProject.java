package array_demo_project;

public class ArrayProject {
    public static void main(String[] args) {

        String Country[]={"India","Australia","Japan","Canada","Russia","England"};
        //Printing Array Data Index Vice:===============================================

        System.out.println("Country Name"+ "= "+Country[3]);
        System.out.println("Country Name"+ "= "+ Country[5]);
        System.out.println("Country Name"+ "= "+ Country[4]);

        int Distance[]={15,10,20,12,22,30,45,46};
        System.out.println("Distance" + " =" +Distance[3]+ " K.m");
        System.out.println("Distance" + " =" +Distance[4]+ " K.m");
        System.out.println("Distance" + " =" +Distance[0]+ " K.m");

        double Height[]={152.2,162.3,165.4,168.2,169.0,172.5};
        System.out.println("Person Height"+ " = "+ Height[1]+ " C.m");
        System.out.println("Person Height"+ " = "+ Height[3]+ " C.m");
        System.out.println("Person Height"+ " = "+ Height[4]+ " C.M");

        //Printing Array data Using For Loop:==============================================

        for (int i=0;i<Country.length;i++){
            System.out.println("Country Name"+ "="+ Country[i]);
        }

        for (int j=0; j<Distance.length;j++){
            System.out.println("Distance"+ "="+Distance[j]+ " K.m");
        }

        for (int k=0; k<Height.length;k++){
            System.out.println("Person Height"+ " ="+ Height[k]+ " C.m");
        }

        //Printing Array data Using Advance For Loop:==============================================
        //Syntax:-loop(Data Type: Array Data Name){
        //       System.out.println( "Code");
        //                  }

        for (String var: Country){
            System.out.println("Country Name"+ " = "+var+ ":-"+"Advance For Loop");
        }

        for (int var: Distance){
            System.out.println("Distance"+" ="+ var + " K.m"+ ":- Advance For Loop");
        }

        for (Double var: Height){
            System.out.println("Person Height"+ "="+ var +" C.m"+ ":- Advance For Loop");
        }
    }
}
