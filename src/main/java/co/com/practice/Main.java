package co.com.practice;

public class Main {
    public static void main(String[] args) {
        Person juan = new Person();
        juan.setAge(33);
        juan.setName("Juan");
        juan.setEyeColor("Gray");

        if (juan.HUMAN == true){
            System.out.println("Name = " + juan.getName());
            System.out.println("Age = " + juan.getAge());
            System.out.println("Eye color = " + juan.getEyeColor());
        }else {
            System.out.println("It isn't a human");
        }


    }
}