package co.com.practice;

public class Employee {

    private String name;
    private String jobPosition;
    private double salary;
    private int yearsService;
    private String department;

    public Employee(){}

    public Employee(String name, String jobPosition, int yearsService, double salary, String department){
        this.name =name;
        this.jobPosition = jobPosition;
        this.salary = salary;
        this.yearsService = yearsService;
        this.department = department;
    }

    public Employee(String name,String jobPosition){
        this.name =name;
        this.jobPosition = jobPosition;
    }
    
    public Employee(String name, String jobPosition, int yearsService, String department){
        this.name = name;
        this.jobPosition = jobPosition;
        this.yearsService = yearsService;
        this.department = department;
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

    public void setYearsService(int yearsService){
        this.yearsService = yearsService;
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

    public int getYearsService() {
        return this.yearsService;
    }

    public String getDepartment() {
        return this.department;
    }

}
