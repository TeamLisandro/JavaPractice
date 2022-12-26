package co.com.practice.datastructure;

import java.util.ArrayList;
import java.util.List;

public class ListPractise {
    // It is only possible to use non-primitive data inside <>
    private List<Integer> numberList;

    public ListPractise(){
        this.numberList=new ArrayList<>();
    }
    public void addElements(int element) {
        this.numberList.add(element);
    }

    public void addElements(List<Integer> elements) {
        this.numberList.addAll(elements);
    }

    public void printElements(){
        for(Integer index:this.numberList){
            System.out.println("The number is: " + index);
        }
    }

}
