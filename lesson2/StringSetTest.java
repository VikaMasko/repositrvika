package lesson2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;


public class StringSetTest implements Testable {
    HashSet<Car> carHashSet = new HashSet<>();
    Car Oka = new Car(105, "Oka", 0.5);
    Car VW = new Car(101, "Volkswagen", 1.2);
    Car Ferrari = new Car(102, "Ferrari", 1.3);
    Car Opel = new Car(103, "Opel", 1.1);

    @Override
    public void test(){
        addValuesToSet();
        printSetEntries();
    }
    private void addValuesToSet(){
        carHashSet.add(Oka);
        carHashSet.add(VW);
        carHashSet.add(Ferrari);
        carHashSet.add(Ferrari);
        carHashSet.add(Ferrari);
    }
    private void printSetEntries(){
        for(Car nextCar : carHashSet){
            System.out.println("Машина марки: " + nextCar.getName()+"\n"+
                               "ID: " + nextCar.getId()+"\n"+
                               "Вес машины: " + nextCar.getWeight());
        }
    }
}


