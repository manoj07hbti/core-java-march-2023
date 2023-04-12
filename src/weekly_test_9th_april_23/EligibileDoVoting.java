package weekly_test_9th_april_23;

public class EligibileDoVoting {
    public static void main(String[] args) {
        //
        int age = 19;
        String country = "Indian";
        if (age >= 18) {
            if (country == "Indian") {
                System.out.println("person is eligibile for voting: " + "age " + age + " country " + country);
            } else {
                System.out.println("person is not eligibile for voting:");
            }
            age=25;
            country="japan";
            if (age>=18){if (country=="Indian"){

                System.out.println("person is eligibile for voting: ");
            } else {
                System.out.println("person is not eligibile for voting: "+ "age " + age + " country " + country);
            }
        }
        }
    }
}