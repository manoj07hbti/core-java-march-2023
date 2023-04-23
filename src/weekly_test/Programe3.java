package weekly_test;

public class Programe3 {
    // Write a programe to find given number is prime or not===============================
    //Prime number condition is this will divsable by-1 & also itself=========================
        public static void main(String[] args) {
            int num =23;
            int count=0;
            for (int i=1; i<= num;i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count==2)
                System.out.println(num +" is a prime number.");
            else
                System.out.println(num+" is not a prime number.");
        }
    }

