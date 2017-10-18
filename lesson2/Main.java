package lesson2;

public class Main {
    public static void main(String[] args){
        Testable testableList = new StringListTest();
        Testable testableMap = new StringMapTest();
        Testable testableSet = new StringSetTest();
        System.out.println("Коллекция List");
        testableList.test();
        testableMap.test();
        testableSet.test();
    }
}
