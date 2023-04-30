package array;

public class ArrayWithAdvanceForLoop {

    public static void main(String[] args) {

        String citys[]= {"Agra","delhi","Firozabad","pune"," jaipur"};

                for (String var : citys){
                    System.out.println("print citys list.."+var);
                }

                int marks []={35,27,87,92,99,67,89,87};

                for (int var : marks){
                    System.out.println(" students marks is .."+var);
                }

                double hight []={23.6,67.9,65.9,457.0,23.9};

                for (double var : hight){
                    System.out.println("print hight..."+var);
                }
    }

}
