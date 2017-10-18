package lesson2;

import java.util.HashMap;


public class StringMapTest implements Testable {
    Car AstonMartin = new Car(100, "Aston Martin", 1.1);
    Car VW = new Car(101, "Volkswagen", 1.2);
    Car Ferrari = new Car(102, "Ferrari", 1.3);
    Car Opel = new Car(103, "Opel", 1.1);
    private String[] array = {"Opel", "VW", "Ferrari", "Aston Martin"};
    private HashMap<String, Car> carMap = new HashMap();
    String hashCode;
    @Override
    public void test(){
        addValuesToMap();
        printMapEntries("10");
        printMapEntries("11");
        printMapEntries("12");
    }
    private void addValuesToMap(){
        carMap.put("10", AstonMartin);
        carMap.put("11", Opel);
        carMap.put("12", Ferrari);
    }

    private void printMapEntries(String hashCode){
        String carName = "";
        int carId;
        Double carWeight;
        Car c = carMap.get(hashCode);
        carName = c.getName();
        carId = c.getId();
        carWeight = c.getWeight();
        System.out.println("Машина марки: "+ carName+ "\n"
                         + "ID машины: "+ carId + "\n"
                         + "Вес машины: " + carWeight);
    }
}