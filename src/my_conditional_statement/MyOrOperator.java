package my_conditional_statement;

public class MyOrOperator {
    public static void main(String[] args) {
        int ram;
        String brand;
        //True or True=True
        ram=8;
        brand="IBM";
        if(ram>=8 || brand=="IBM"){
            System.out.print("it is good quality product  "+ram + brand);
        }else{
            System.out.println("it is not good quality product "+ram + brand);
        }
        //false||true=true
        ram=7;
        brand="IBM";
        if(ram>=8 || brand=="IBM"){
            System.out.print("it is good quality product  "+ram + brand);
        }else{
            System.out.println("it is not good quality product "+ram + brand);
        }
        //true||false=ture
        ram=8;
        brand="jbm";
        if(ram>=8 || brand=="IBM"){
            System.out.print("it is good quality product  "+ram + brand);
        }else{
            System.out.println("it is not good quality product "+ram + brand);
        }
        //false||false=false
        ram=7;
        brand="jbm";
        if(ram>=8 || brand=="IBM"){
            System.out.print("it is good quality product  "+ram + brand);
        }else{
            System.out.println("it is not good quality product "+ram + brand);
        }

    }
}
