package collection_hashmap;

import jdk.nashorn.internal.ir.BaseNode;

import java.util.HashMap;
import java.util.Set;

public class BankCustomerHashmap {
    public void createBankCustHashmap(){
        HashMap<Integer,String> bankcustomer=new HashMap<>();

        bankcustomer.put(0001,"RAHUL");
        bankcustomer.put(0002,"RAM");
        bankcustomer.put(0003,"REENA");
        bankcustomer.put(0004,"SUJATA");
        bankcustomer.put(0005,"MAMTA");
        bankcustomer.put(0006,"MUKESH");
        bankcustomer.put(0007,"SHAILESH");
        bankcustomer.put(9,"RAJ");
        bankcustomer.put(0010,"ROCKY");

        //before remove object at 9 keyindex
        System.out.println("before remove customer " +bankcustomer.get(9));

        bankcustomer.remove(9);

        Set<Integer> keys=bankcustomer.keySet();

        for (Integer var:keys){
            System.out.println("after remove customer " +bankcustomer.get(var));
        }
    }

    public static void main(String[] args) {

        BankCustomerHashmap obj = new BankCustomerHashmap();
        obj.createBankCustHashmap();

    }
}