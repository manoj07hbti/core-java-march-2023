package oops.abstraction;

public class GooglePay implements Payment{
    @Override
    public void payment() {
        System.out.println("Google pay Payment ...");
    }
}
