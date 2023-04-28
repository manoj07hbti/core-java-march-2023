package class_and_object.creating_object;

public class Engineer {
    String name = "AMIT";
    int age = 23;
    String field="MECHANICAL ENGINEER";
    double salary=45864.25;
    String id="ENG4588";

    public static void main(String[] args){
        Engineer obj1 = new Engineer();
        System.out.println("\nPrinting object 1 of Engineer class\n"+"NAME : "+obj1.name+"\nAGE : "+obj1.age+"\nFIELD : "+obj1.field+"\nSALARY : "+obj1.salary+"\nID : "+obj1.id);

        Engineer obj2 = new Engineer();
        System.out.println("\nPrinting object 1 of Engineer class\n"+"NAME : "+obj2.name+"\nAGE : "+obj2.age+"\nFIELD : "+obj2.field+"\nSALARY : "+obj2.salary+"\nID : "+obj2.id);

        Engineer obj3 = new Engineer();
        System.out.println("\nPrinting object 1 of Engineer class\n"+"NAME : "+obj3.name+"\nAGE : "+obj3.age+"\nFIELD : "+obj3.field+"\nSALARY : "+obj3.salary+"\nID : "+obj3.id);
    }
}
