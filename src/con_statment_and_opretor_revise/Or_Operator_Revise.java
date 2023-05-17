package con_statment_and_opretor_revise;

public class Or_Operator_Revise {

    public static void main(String[] args) {

        int pendrive;
        String brand;

        //True or True=True

         pendrive = 8;
        brand="IBM";

        if(  pendrive>=8 || brand=="IBM"){
            System.out.print(" it is good quality product.");
        }else{
            System.out.println(" it is not good quality product. ");
        }

        //false||true=true

        pendrive=7;
        brand="IBM";
        if(  pendrive>=8 || brand=="IBM"){
            System.out.print(" it is good quality product.");
        }else{
            System.out.println(" it is not good quality product. ");
        }

        //true||false=ture

        pendrive=8;
        brand="jbm";
        if(  pendrive>=8 || brand=="IBM"){
            System.out.print(" it is good quality product.  ");
        }else{
            System.out.println(" it is not good quality product. ");
        }

        //false||false=false

        pendrive=7;
        brand="jbm";
        if(  pendrive>=8 || brand=="IBM"){
            System.out.print(" it is good quality product.  ");
        }else{
            System.out.println(" it is not good quality product. ");
        }

    }
}







