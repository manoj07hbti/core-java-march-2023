package assignment;

public class Multipe_MainMethods_In_OneClass {
    public static void main(String[] args){
        System.out.println("main method 1");
        main(1);
        main("");

    }
    public static int main(int args){
        System.out.println("main method 2");
        return 0;
    }
    public static void main(String args){
        System.out.println("main method 3");
    }
}
