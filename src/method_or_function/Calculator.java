
package method_or_function;

public class Calculator {

    public void addition() {
        int a = 80;
        int b = 40;
        int sum = a + b;
        System.out.println("On connecting a and b " +sum);
    }

    public void subtract() {
        int c = 220;
        int d = 120;
        int sub = c - d;
        System.out.println("Subtracting both number " + sub);
    }

    public void multiply() {
        int e = 8;
        int f = 12;
        int multi = e * f;
        System.out.println("on multiply e and f " + multi);
    }

    public void divide() {
        int g = 120;
        int h = 12;
        int divide = g / h;
        System.out.println("on divided g and h " + divide);
    }

    public void percentage() {
        int i = 230;
        int j = 45;
        int percentage = i * j / 100;
        System.out.println("on percentage i and j " + percentage);

    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.addition();
        obj.subtract();
        obj.divide();
        obj.multiply();
        obj.percentage();

    }





        }


