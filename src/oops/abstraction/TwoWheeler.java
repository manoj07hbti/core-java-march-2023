package oops.abstraction;

public class TwoWheeler extends Vehicle{

    public static void main(String[] args) {

        TwoWheeler twoWheeler= new TwoWheeler();
        twoWheeler.setEngineNumber("ABC12");
        twoWheeler.setPower(10);
        twoWheeler.setPrice(3432432.23);

        twoWheeler.displayInformation(twoWheeler);

    }

    @Override
    public void servicing() {
        System.out.println("This is two wheeler Servicing ....");
    }

    @Override
    public void pricing() {
        System.out.println("This is two wheeler Pricing  ....");
    }
}
