package Model;

public class Corporate_Employee_Advance_Hashmap {
    String CompanyName;
    String EmployeeName;
    int EmployeeId;
    int Salary;

    public Corporate_Employee_Advance_Hashmap(String CompanyName,String EmployeeName,int EmployeeId,int Salary){
        this.CompanyName=CompanyName;
        this.EmployeeName=EmployeeName;
        this.EmployeeId=EmployeeId;
        this.Salary=Salary;
    }
    public String getCompanyName(){

        return CompanyName;
    }
    public void SetName(String CompanyName){

        this.CompanyName=CompanyName;
    }
    public String getEmployeeName() {
        return EmployeeName;
    }
    public void SetEmployeeName(String EmployeeName){
        this.EmployeeName=EmployeeName;
    }

    public int getEmployeeId(){

        return EmployeeId;
    }
    public void SetEmployeeId(int EmployeeId){

        this.EmployeeId=EmployeeId;
    }
    public int getSalary(){

        return Salary;
    }
    public void setSalary(int Salary){

        this.Salary=Salary;
    }


}
