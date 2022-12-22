package co.com.practice;

public class Bicycle {

    //state, field or variable
    private int gear = 5;

    //behavior, function or method
    public void braking() {
        System.out.println("working of braking");
    }

    // for Bicycle class
    Bicycle sportBicycle = new Bicycle();

    Bicycle touringBicycle = new Bicycle();

}
