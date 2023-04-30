package loop;

public class BreakWithLoop {
    public static void main(String[] args) {


        //break with for loop

        for (int i = 1; i <= 10; i++) {
            System.out.println("print for loop.." + i);
            if (i == 5) {
                break;

            }
        }
        //break with decrement

        for (int i = 10; i > 0; i--) {
            System.out.println("print decrement for loop.. " + i);

            if (i == 4) {
                break;
            }
        }

        //break with while loop

        int i = 0;
        while (i < 10) {
            System.out.println("print while loop..." + i);
            i++;
            if (i == 6) {
                break;
            }

        }


        //break with do while loop
        int k = 0;

        do {
            System.out.println("print do while loop ..." + k);
            k++;
            if (k == 3) {
                break;
            }
        } while (k < 5);


        // break with advance for loop
        int l=0;
        String arr[] = {"HINDI", "English", "Math,", "History"};



            for (String var : arr) {
                l++;
                System.out.println("print advance for loop " + var+" "+l);

                if (l==3) {
                    break;
            }
        }
    }
        }

