package co.com.practice;

import java.util.ArrayList;
import java.util.List;

public class MainEmployee {
    //this is the main method of this class. We always declare a main method in this way, using () and the entry parameters. See below


    public static void main (String[] args){
        double salary = 0;
        double commission = 0;
        List<Employee> employeeList = new ArrayList<>(); //I am creating a new list of employees named employeeList

        Employee employee1 = new Employee("Juan","Back-End",5, "Engineering");
        salary = Salary.getSalary(employee1.getJobPosition());
        commission = Salary.calculateCommission(salary, employee1.getYearsService());  // I use this previous structure because the method calculateCommission is static
        employee1.setSalary(salary + commission);  //It's possible to call the method calculateNewSalary because I set it "static" when I created it
        System.out.println("Employee1 =" + employee1.getSalary());

        Employee employee2 = new Employee("Pedro","Front-End",10, "Engineering");
        salary = Salary.getSalary(employee2.getJobPosition());
        commission = Salary.calculateCommission(salary, employee2.getYearsService());  // I use this previous structure because the method calculateCommission is static
        employee2.setSalary(salary + commission);  //It's possible to call the method calculateNewSalary because I set it "static" when I created it
        System.out.println("Employee2 =" + employee2.getSalary());

        Employee employee3 = new Employee("Maria","FullStack",5, "Engineering");
        salary = Salary.getSalary(employee3.getJobPosition());
        commission = Salary.calculateCommission(salary, employee3.getYearsService());  // I use this previous structure because the method calculateCommission is static
        employee3.setSalary(salary + commission);  //It's possible to call the method calculateNewSalary because I set it "static" when I created it
        System.out.println("Employee3 =" + employee3.getSalary());

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        for(Employee index:employeeList){
            salary = Salary.getSalary(index.getJobPosition());
            commission = Salary.calculateCommission(salary, index.getYearsService());  // I use this previous structure because the method calculateCommission is static
            index.setSalary(salary + commission);  //It's possible to call the method calculateNewSalary because I set it "static" when I created it
            System.out.println("Employee name = " + index.getName() + ", Salary = " + index.getSalary());
        }


        }


}
