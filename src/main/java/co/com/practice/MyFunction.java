package co.com.practice;

//Math operations class
public class MyFunction {

    public int addTwoNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public int subtractTwoNumbers(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public int multiplyTwoNumbers(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }
    public void showResult (int result, String operationType) {
        System.out.println("The " + operationType  + " is: " + result);
    }

}
