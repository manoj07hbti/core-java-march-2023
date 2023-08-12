package method_and_function2;

public class Calculator {
    public void addition() {

        int a = 40;
        int b = 10;
        int sum = a + b;
        System.out.println("On connecting a and b " + sum);
    }

    public void Subtract() {

        int c = 80;
        int d = 27;
        int sub = c - d;
        System.out.println("Subtracting c and d " + sub);
    }

    public void multi() {

        int e = 6;
        int f = 8;
        int multi = e * f;
        System.out.println("Multiply e and f " + multi);
    }

    public void divide() {

        int g = 40;
        int h = 5;
        int div = g / h;
        System.out.println("Divide g and h " + div);
    }

    public void percent() {

        int i = 80;
        int j = 5;
        int per = i * j / 100;
        System.out.println("Divide i and j " + per);
    }

    public static void main(String[] args) {

        Calculator obj = new Calculator();
        obj.addition();
        obj.Subtract();
        obj.multi();
        obj.divide();
        obj.percent();


    }
}