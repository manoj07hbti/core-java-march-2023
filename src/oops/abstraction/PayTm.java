package oops.abstraction;

public class PayTm implements Payment{
    @Override
    public void payment() {
        System.out.println("PayTm Payment ...");
    }
}
