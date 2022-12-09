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

    }
}
