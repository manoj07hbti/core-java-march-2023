package weekly_test;

public class April_23_test {

    // NUMBER DIV BY 180 SHOULD NOT BE ODD

    public void evenorodd(){
        for(int i=1;i<=180;i++){
            if(i%11==0 && i%2==0){
                    System.out.println(+i +" IS DIVISIBLE BY 11 AND ITS NOT ODD NUMBER");

            }
        }
    }

    public void primeornot(){
        int num=17;
        boolean value=false;
        for(int j=2;j<num;j++) {
            if (num % j == 0) {
                value = true;
                break;
            }
        }
        if(!value)
            System.out.println("\n"+num +" IS PRIME NUMBER");
        else
            System.out.println("\n"+num +" IS NOT PRIME NUMBER");

    }
    public static void main(String[] args) {
        April_23_test obj=new April_23_test();
        obj.evenorodd();
        obj.primeornot();
    }
}
