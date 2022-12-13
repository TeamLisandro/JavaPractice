package co.com.practice;

public class Employee {

    private String name;
    private String jobPosition;
    private double salary;
    private String hiringDate;
    private String department;

    public Employee(){}

    public Employee(String name,String jobPosition,String hiringDate,double salary,String department){
        this.name =name;
        this.jobPosition = jobPosition;
        this.salary = salary;
        this.hiringDate = hiringDate;
        this.department = department;
    }

    public Employee(String name,String jobPosition){
        this.name =name;
        this.jobPosition = jobPosition;
    }

    public void setName(String name){
         this.name = name;
    }

    public void setJobPosition(String jobPosition){
        this.jobPosition = jobPosition;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void setHiringDate(String hiringDate){
        this.hiringDate = hiringDate;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getName(){
        return this.name;
    }

    public String getJobPosition(){
        return this.jobPosition;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getHiringDate() {
        return this.hiringDate;
    }

    public String getDepartment() {
        return this.department;
    }

}
