package class_and_object;

public class Doctor {

    String name = "rohan";
    String id ="DOC8520";
    String field = "CARDIOLOGIST";
    String hospital="RML";
    int age=27;

    public static void main(String[] args){

        Doctor obj1 =new Doctor();
        System.out.println("printing object 1 of Doctor class\n" +"NAME : "+obj1.name +"\nID : "+obj1.id +"\nFIELD : "+obj1.field +"\nHOSPITAL : "+obj1.hospital +"\nAGE : "+obj1.age);

        Doctor obj2 =new Doctor();
        System.out.println("\nprinting object 2 of Doctor class\n" +"NAME : "+obj2.name +"\nID : "+obj2.id +"\nFIELD : "+obj2.field +"\nHOSPITAL : "+obj2.hospital +"\nAGE : "+obj2.age);

        Doctor obj3 =new Doctor();
        System.out.println("\nprinting object 3 of Doctor class\n" +"NAME : "+obj3.name +"\nID : "+obj3.id +"\nFIELD : "+obj3.field +"\nHOSPITAL : "+obj3.hospital +"\nAGE : "+obj3.age);
    }
}
