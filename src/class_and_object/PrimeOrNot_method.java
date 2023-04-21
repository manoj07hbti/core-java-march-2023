package class_and_object;

public class PrimeOrNot_method {
    public void primeornot(){
        int a=2;
        if(a%2==0){
            System.out.println("\n"+a+" IS PRIME NUMBER");
        }else{
            System.out.println("\n"+a+" IS NOT PRIME NUMBER");
        }
    }

    public static void main(String[] args) {
        PrimeOrNot_method obj=new PrimeOrNot_method();
        obj.primeornot();
    }
}
