package lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StringListTest implements Testable{
    private String[] array = {"Opel", "VW", "Ferrari"};
    private List list = new LinkedList();
    @Override
    public void test(){
        addValuesToList(array);
        printListEntries(list);
    }
    private void addValuesToList(String[] array){
        for (int i = 0; i<array.length; i++){
            list.add(array[i]);
        }
    }
    private void printListEntries(List list){
        String carName = "";
        for (int i = 0; i<array.length; i++) {
            carName = list.get(i) + " ";
            System.out.println(carName);
        }
    }
}
