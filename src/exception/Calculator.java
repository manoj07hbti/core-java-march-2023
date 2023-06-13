package exception;

public class Calculator {
    public int division(int a,int b){
        int result=0;
        try {
            result = a / b;

        }
        catch (Exception e){
            System.out.println("Exception occured"+e);
        }
        finally{
            System.out.println("THIS IS FINALLY BLOCK ,IT WILL EXECUTE EVERYTIME");
        }
        return result;
    }
    public void printarray() {
        int[] arr = {1, 2, 5, 9, 4, 7, 8};
        try{
        System.out.println(arr[8]); //index 8
        }catch(Exception e){
            System.out.println("exception occured"+e);
        }

    }
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println("before calling method");
        System.out.println("\ndivision is :"+obj.division(9,0));
        System.out.println("\ndivision is :"+obj.division(4,2));

        obj.printarray();
        System.out.println("\nafter calling printarray() method");
    }
}
