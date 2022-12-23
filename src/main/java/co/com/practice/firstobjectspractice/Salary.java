package co.com.practice.firstobjectspractice;

public class Salary {

    private static final double BACK_END_SALARY = 8000000;
    private static final double FRONT_END_SALARY = 6000000;
    private static final double FULL_STACK_SALARY = 12000000;


    // When we define a static method we don't need to create an object to use this method
    public static double getSalary(String jobPosition){
        if (jobPosition.equals("Back-End"))
            return BACK_END_SALARY;
        else if (jobPosition.equals("Front-End"))
            return FRONT_END_SALARY;
        else if (jobPosition.equals("FullStack"))
            return FULL_STACK_SALARY;
        else return 0;
    }

    public static double calculateCommission(double salary, int percentage){
        return salary * percentage/100;
    }
}
