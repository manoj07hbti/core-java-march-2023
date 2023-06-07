package exception;

public class Calculator {

    public int divide(int a,int b){
        int result=0;
        try{
             result=  a/b;
        }
        catch (Exception e){
            System.out.println("Exception occurred :"+e);
        }
        finally {
            System.out.println("THIS IS FINALLY BLOCK, IT WILL EXECUTE EVERYTIME");
        }

        return result;
    }

    public void printArray(){

        int [] arr={1,2,4,6,7,9};

        try {
            System.out.println(arr[9]);
        }catch (Exception e){

            System.out.println("Exception occurred :"+e);
        }


    }


    public static void main(String[] args) {

        Calculator obj= new Calculator();
        System.out.println("Before calling method");
        System.out.println("division is "+obj.divide(9,0));
        System.out.println("division is "+obj.divide(4,2));
        System.out.println("After calling method");



       obj.printArray();
        System.out.println("After calling printArray method");

    }
}
