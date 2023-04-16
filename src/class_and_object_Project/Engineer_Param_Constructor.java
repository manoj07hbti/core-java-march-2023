package class_and_object_Project;

public class Engineer_Param_Constructor {
    String college_name;
    String student_name;
    int age;
    String branch;
    int year;

    public Engineer_Param_Constructor(String college_name, String student_name, int age, String branch, int year) {
        this.college_name = college_name;
        this.student_name = student_name;
        this.age = age;
        this.branch = branch;
        this.year = year;
    }

    public static void main(String[] args) {
        // Printing Student 1 Details Using Param Constructor:-========================

        Engineer_Param_Constructor obj1= new Engineer_Param_Constructor("PSIT","Ajeet Chauhan",
                24,"IT",3);
        System.out.println("Printing Student Details-1 :- ");
        System.out.println("College Name:- "+obj1.college_name);
        System.out.println("Student name:- "+ obj1.student_name);
        System.out.println("Age:- "+obj1.age);
        System.out.println("Branch:- "+ obj1.branch);
        System.out.println("Year:- "+obj1.year);

        // Printing Student 1 Details Using Param Constructor:-========================

        Engineer_Param_Constructor obj2= new Engineer_Param_Constructor("HBTU","Akhil Dixit",
                23,"Mechanical",2);
        System.out.println("Printing Student Details-2 :- ");
        System.out.println("College Name:- "+obj2.college_name);
        System.out.println("Student name:- "+ obj2.student_name);
        System.out.println("Age:- "+obj2.age);
        System.out.println("Branch:- "+ obj2.branch);
        System.out.println("Year:- "+obj2.year);
    }
}
