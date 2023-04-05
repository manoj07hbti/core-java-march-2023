package assignments;

public class NotOpertor {

    public static void main(String[] args) {

        //here we checking eligibility of Doctor using Not_Operator

        String qualification = "MMBS";
        if (!(qualification != "MMBS")) {
            System.out.println("Person is eligible for Doctor post");

        } else {
            System.out.println("Person is not eligible for Doctor post");

        }

        // when we use onle single not_operator than it will exicute else part e.i.
        if ((qualification != "MMBS")) {
            System.out.println("Person is eligible for Doctor post");

        } else {
            System.out.println("Person is not eligible for Doctor post");

        }

    }
}


