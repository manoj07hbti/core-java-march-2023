package Return_Type_Method;

public class Calculator_with_return_type {

    //Return Type Method

    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }

    public int sub(int h,int b){
        int sub=h-b;
        return sub;
    }

    public int mul(int h,int j){
        int mul=h*j;
        return mul;
    }

    public int div(int o,int k){
        int div=o/k;
        return div;
    }

    public static void main(String[] args) {
        Calculator_with_return_type obj=new Calculator_with_return_type();
        int Add=obj.add(89,78);
        System.out.println("Print all number sum: "+Add);

        int Sub=obj.sub(7898,567);
        System.out.println("Print all number sub: "+Sub);

        int mul=obj.mul(789,67);
        System.out.println("Print all number Multiple: "+mul);

        int div=obj.div(9877,77);
        System.out.println("Print all number div: "+div);
    }



}
