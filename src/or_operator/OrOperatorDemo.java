package or_operator;

public class OrOperatorDemo {
    public static void main(String[]args){
        int nancy;
        String brand;
        //Ture + True = True
        nancy= 4;
        brand=" nty";
        if(nancy>4 || brand =="nty") {

            System.out.println("this is a good quality product" + nancy + brand);
        }else{
            System.out.println("this is not a good quality product"+nancy+brand);
        }
        // false + true = true
        nancy= 7;
        brand=" nty";
        if(nancy>4 || brand =="nty") {

            System.out.println("this is a good quality product" + nancy + brand);
        }else{
            System.out.println("this is not a good quality product"+nancy+brand);
        }
        // true + false = true

        nancy= 4;
        brand="itm ";
        if(nancy>4 || brand =="nty") {

            System.out.println("this is a good quality product" + nancy + brand);
        }else{
            System.out.println("this is not a good quality product"+nancy+brand);
        }

        // false + false = false
        nancy= 8;
        brand="kml ";
        if(nancy>4 || brand =="nty") {

            System.out.println("this is a good quality product" + nancy + brand);
        }else{
            System.out.println("this is not a good quality product"+nancy+brand);
        }
    }

}
