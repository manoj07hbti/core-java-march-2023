package exception;

public class ExceptionDemo {
    public int add(int a , int b){
        int result=0;
        try {
            result=a/b;
        }
        catch (Exception e){
            System.out.println("this is "+e);
        }

        return result;
    }
    public void printarray(){
        int arr []={1,23,45,56,65};
        try {
            System.out.println(+arr[7]);
        }
        catch (Exception e){
            System.out.println("exception occured " +e);
        }

    }

    public static void main(String[] args) {
        ExceptionDemo obj=new ExceptionDemo();
        System.out.println("before method calling");

        System.out.println(+obj.add(5,0));
        System.out.println(" after calling method");
        obj.printarray();
    }
}
