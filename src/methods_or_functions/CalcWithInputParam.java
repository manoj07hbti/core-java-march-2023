package methods_or_functions;

public class CalcWithInputParam {

    public void add(int a, int b){

        int sum=a+b;

        System.out.println("Addition is : "+sum);
    }

    //sub  a-b

    // divide a/b

    // multi a*b

    // percentage (number*percentage)/100
    public static void main(String[] args) {

        CalcWithInputParam obj= new CalcWithInputParam();
        obj.add(3,7);
        obj.add(23,123);
        obj.add(123,2321);
    }
}
