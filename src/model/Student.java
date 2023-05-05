package model;

public class Student {

    String name;
    int age;
    int Roll_no;
    String stream;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll_no() {
        return Roll_no;
    }

    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public Student(String name, int age, int roll_no, String stream) {
        this.name = name;
        this.age = age;
        Roll_no = roll_no;
        this.stream = stream;

    }
}
