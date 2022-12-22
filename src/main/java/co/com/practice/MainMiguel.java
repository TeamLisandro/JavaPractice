 package co.com.practice;

public class MainMiguel {

    public static void main(String[] args) {
       MyFunction basicMath = new MyFunction();
       int resultNumberA = basicMath.addTwoNumbers(2,3);
       int resultNumberS = basicMath.subtractTwoNumbers(2,3);
       int resultNumberM = basicMath.multiplyTwoNumbers(2,3);

       basicMath.showResult(resultNumberA, "addition");
       basicMath.showResult(resultNumberS, "subtraction");
       basicMath.showResult(resultNumberM, "multiplication");



       Employee employee1 = new Employee("lisandro","engineer",20,40000,"QA");

       System.out.println(employee1.getName()); //with this method I can check the value of a variable in this specific part of my code, in order to identify deviations or mistakes in the value

       Employee employee2 = new Employee();
       employee2.setName("miguel");
       employee2.setJobPosition("engineer");
       employee2.setYearsService(1);
       employee2.setSalary(20000);
       employee2.setDepartment("QA");

        System.out.println(employee2.getName());

        Employee employee3 = new Employee ("javier","swimming instructor");

        System.out.println("name: " + employee3.getName() + ", job position: " + employee3.getJobPosition());

    }


}
