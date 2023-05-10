package Class_Object;

public class Doctor {
    String name;
    int age;
    String specialization;
    int con_fee;


    public static void main(String[]args){
        Doctor obj1=new Doctor();

        System.out.println("Printing name "+obj1.name + " age "+ obj1.age +"special. "+obj1.specialization +" fee "+obj1.con_fee);
    }

}
