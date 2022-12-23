package co.com.practice.firstobjectspractice;

public class Person {
    private String name;
    private int age;
    private String eyeColor;
    public final boolean HUMAN = true;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setEyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getEyeColor(){
        return this.eyeColor;
    }
}