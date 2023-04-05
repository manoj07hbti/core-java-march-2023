package assignments;

public class Or_Operator {

    public static void main(String[] args) {
        String brand = "IBM";
        int ram = 8;
        // 1.   TRUE  || TRUE = TRUE    1+1= 1
        if (brand == "IBM" || ram >= 8) {
            System.out.println("Product is ok for Sale: TRUE  || TRUE = TRUE 1+1= 1");
        } else {
            System.out.println("Product is not ok for Sale");
        }

        //  TRUE  || FALSE= TRUE    1+0= 1
        ram = 5;
        if (brand == "IBM" || ram >= 8) {
            System.out.println("Product is ok for Sale :TRUE  || FALSE= TRUE    1+0= 1");
        } else {
            System.out.println("Product is not ok for Sale: ");
        }
        //  FALSE || TRUE=  TRUE    0+1= 1
        brand = "HP";
        ram = 16;
        if (brand == "IBM" || ram >= 8) {
            System.out.println("Product is ok for Sale: FALSE || TRUE= TRUE    0+1= 1");
        } else {
            System.out.println("Product is not ok for Sale ");
        }
        //  FALSE || FALSE= FALSE   0+0= 0
        brand = "Sandisck";
        ram = 4;
        if (brand == "IBM" || ram >= 8) {
            System.out.println("Product is ok for Sale ");

        } else System.out.println("Product is not ok for Sale: FALSE || FALSE =FALSE 0+0=0 ");
    }
}

