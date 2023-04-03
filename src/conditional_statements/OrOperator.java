package conditional_statements;

public class OrOperator {

    public static void main(String[] args) {

       int marks;

       String section;
       section="SCIENCE";

       // 1.   TRUE  || TRUE = TRUE    1+1= 1
        marks=75;
        if( marks>=33||marks>=60){
            System.out.println("Student cleared exam ");
        }else {
            System.out.println("Student did not cleared exam.");
        }

      //2.   TRUE  || FALSE= TRUE    1+0= 1
        marks=45;
        if( marks>=33||marks>=60){
            System.out.println("Student cleared exam :2.   TRUE  || FALSE= TRUE    1+0= 1");
        }else {
            System.out.println("Student did not cleared exam.");
        }


        //3.   FALSE || TRUE=  TRUE    0+1= 1
        marks=30;
        if( marks>=33 || section=="SCIENCE"){
            System.out.println("Student cleared exam :3.   FALSE || TRUE=  TRUE    0+1= 1");
        }else {
            System.out.println("Student did not cleared exam.");
        }

        //4.   FALSE || FALSE= FALSE   0+0= 0
        section="ARTS";
        if( marks>=33 || section=="SCIENCE"){
            System.out.println("Student cleared exam :3.   FALSE || TRUE=  TRUE    0+1= 1");
        }else {
            System.out.println("Student did not cleared exam.:4.   FALSE || FALSE= FALSE   0+0= 0");
        }

    }
}
