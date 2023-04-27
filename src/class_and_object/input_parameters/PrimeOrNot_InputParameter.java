package class_and_object.input_parameters;
public class PrimeOrNot_InputParameter {
    public void primeornot(int num){
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
        PrimeOrNot_InputParameter obj=new PrimeOrNot_InputParameter();
        obj.primeornot(13);
    }
}
