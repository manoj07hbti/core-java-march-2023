package myloops;

public class DoWhileLoopTables {
    public static void main(String[] args) {
        int i=1;
        int number=5;
        do{
            System.out.println("5*"+i +"=" +number*i);
i++;
        }while(i<=10);

        int j=1;
        number=10;
        do{
            System.out.println("table of ten 10*"+j +"=" +number*j);
            j++;
        }while(j<=10);

    }
}
