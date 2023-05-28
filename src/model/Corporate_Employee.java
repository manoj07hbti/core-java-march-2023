package model;

public class Corporate_Employee {
    int corpEmp_id;
    String corpEmp_Name;
    String corpEmp_compName;
    int corpEmp_Salary;

    public Corporate_Employee(int corpEmp_id, String corpEmp_Name, String corpEmp_compName, int corpEmp_Salary) {
        this.corpEmp_id = corpEmp_id;
        this.corpEmp_Name = corpEmp_Name;
        this.corpEmp_compName = corpEmp_compName;
        this.corpEmp_Salary = corpEmp_Salary;
    }

    public int getCorpEmp_id() {
        return corpEmp_id;
    }

    public void setCorpEmp_id(int corpEmp_id) {
        this.corpEmp_id = corpEmp_id;
    }

    public String getCorpEmp_Name() {
        return corpEmp_Name;
    }

    public void setCorpEmp_Name(String corpEmp_Name) {
        this.corpEmp_Name = corpEmp_Name;
    }

    public String getCorpEmp_compName() {
        return corpEmp_compName;
    }

    public void setCorpEmp_compName(String corpEmp_compName) {
        this.corpEmp_compName = corpEmp_compName;
    }

    public int getCorpEmp_Salary() {
        return corpEmp_Salary;
    }

    public void setCorpEmp_Salary(int corpEmp_Salary) {
        this.corpEmp_Salary = corpEmp_Salary;
    }
}