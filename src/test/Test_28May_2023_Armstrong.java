package test;

import java.util.Scanner;

public class Test_28May_2023_Armstrong {
    public static void main(String[] args) {
     // (input took Scanner )
        Scanner sc = new Scanner(System.in);

        // massage the user for input number
        System.out.println("Enter Any Number");

        int n = sc.nextInt();

        int temp = n;
         int res =0 ;

        while (temp>0) {

            // n given last digit
            int id = temp % 10;
            // (last digit got make the cube and add in result)
            res = res + id * id * id;
            temp = temp / 10;
        }
            if (res==n) {
                System.out.println("Number is Armstrong");
            }
                else{
                    System.out.println("Number is not Armstrong");

                }

        }
    }

