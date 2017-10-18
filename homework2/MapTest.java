package homework2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest implements Testable {
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
        printMapEntries(carMap);
        //deleteMaxWeight(carMap);
        //weightSum(carMap);
        //addToName(carMap);
        returnTwo(carMap);
        printMapEntries(carMap);
    }
    private void addValuesToMap(){
        carMap.put("AstonMartin", AstonMartin);
        carMap.put("Opel", Opel);
        carMap.put("Ferrari", Ferrari);
    }

    private void printMapEntries(HashMap<String, Car> map){
        System.out.println("Map: ");
        for(Map.Entry<String, Car> pair : map.entrySet()){
            System.out.println("Машина марки: " + pair.getValue().getName() +
                    ", ID машины: " + pair.getValue().getId() +
                    ", Вес машины: " + pair.getValue().getWeight());
        }
    }
    private void deleteMaxWeight(HashMap<String, Car> map){
        Double maxWeight = 0.0;
        String key = "";
        Iterator<Map.Entry<String, Car>> it = map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String, Car> pair = it.next();
            if (pair.getValue().getWeight()>maxWeight){
                maxWeight = pair.getValue().getWeight();
            }
        }
        for(Map.Entry<String, Car> pair : map.entrySet()){
            if (pair.getValue().getWeight()==maxWeight){
                key = pair.getKey();
            }
        }
        map.remove(key);
        System.out.println(maxWeight);

    }
    private void weightSum(HashMap<String, Car> map){
        Double sum = 0.0;
        for(Map.Entry<String, Car> pair : map.entrySet()){
            sum = pair.getValue().getWeight() + sum;
        }
        System.out.println("Сумма поля: "+ sum);
    }
    private void addToName(HashMap<String, Car> map){
        for(Map.Entry<String, Car> pair : map.entrySet()){
            pair.getValue().setName(pair.getValue().getName()+"_1");
        }
    }
    private void returnTwo(HashMap<String, Car> map){
        HashMap.Entry<String, Car> firstEntry = map.entrySet().iterator().next();
        String firstEntryID = firstEntry.getKey();
        Car firstCar = map.get(firstEntryID);
        map.remove(firstEntryID);
        HashMap.Entry<String, Car> secondEntry = map.entrySet().iterator().next();
        String seconfEntryID = secondEntry.getKey();
        Car secondCar = map.get(seconfEntryID);
        System.out.println("Вторая машина: "+secondCar.getName());
    }
}
