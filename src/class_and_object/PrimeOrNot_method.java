package class_and_object;
public class PrimeOrNot_method {
    public void primeornot(){
        int num=9;
        boolean value=false;
        for(int i=2;i<num;i++) {
            if (num % i == 0) {
                value = true;
                break;
            }
        }
            if(!value)
                System.out.println(+num+" IS PRIME NUMBER");
            else
                System.out.println(+num +" IS NOT PRIME NUMBER");


    }

    public static void main(String[] args) {
        PrimeOrNot_method obj=new PrimeOrNot_method();
        obj.primeornot();
    }
}
