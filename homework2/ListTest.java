package homework2;

import java.util.*;

public class ListTest implements Testable{
    private String[] array = {"Opel", "VW", "Ferrari"};
    Car astonMartin = new Car(106, "Aston Martin", 1.1);
    Car VW = new Car(101, "Volkswagen", 1.0);
    Car Ferrari = new Car(102, "Ferrari", 1.2);
    Car Opel = new Car(103, "Opel", 1.3);
    Car OpelAstra =  new Car(104, "Opel", 1.4);
    Car OpelZafira = new Car(105, "Opel", 1.5);
    private LinkedList<Car> carList = new LinkedList();

    @Override
    public void test(){
        addValuesToList();
        printListEntries(carList);
        //deleteMaxWeight(carList);
        //deleteMinWeight(carList);
        //deleteLessThen(carList, 1.3);
        //printListEntries(carList);
        //weightSum(carList);
        //returnThird(carList);
        //returnTwo(carList);
        //chooseTemplate(carList);
        //addToName(carList);
        //sortID(carList);
        //printListEntries(carList);
    }
    private void addValuesToList(){
        carList.add(astonMartin);
        carList.add(VW);
        carList.add(Ferrari);
        carList.add(Opel);
        carList.add(OpelAstra);
        carList.add(OpelZafira);
    }
    private void printListEntries(LinkedList<Car> list){
        System.out.println("List: ");
        for (Car nextCar : list) {
            System.out.println("Марка: " + nextCar.getName() + ",  Вес: " + nextCar.getWeight());
        }
    }
    private void deleteMaxWeight(LinkedList<Car> list){
        Double maxWeight = 0.0;
        Car maxWeightCar= new Car(0, "", 0.0);
        Iterator<Car> it = list.iterator();
        while (it.hasNext()){
          Car current = it.next();
          if(current.getWeight()> maxWeight){
              maxWeight = current.getWeight();
              maxWeightCar = current;
          }
        }
        list.remove(maxWeightCar);
        System.out.println("Максимальный вес:  "+maxWeight);
    }
    private void deleteMinWeight(LinkedList<Car> list){
        Double minWeight = 1.6;
        Car minWeightCar= new Car(0, "", 0.0);
        Iterator<Car> it = list.iterator();
        while (it.hasNext()){
            Car current = it.next();
            if(current.getWeight()< minWeight){
                minWeight = current.getWeight();
                minWeightCar = current;
            }
        }
        for(int i = 0; i < list.size(); i++){
            if (list.get(i).getWeight()==minWeight){
                list.remove(i);
            }
        }
        System.out.println("Минимальный вес:  "+minWeight);
    }
    private void deleteLessThen(LinkedList<Car> list, Double value){
        Iterator<Car> it =list.iterator();
        while (it.hasNext()){
            Car current = it.next();
            if(current.getWeight()<value){
                list.remove(current);
            }
        }
        System.out.println("Удалены значения меньше "+ value);
    }
    private void weightSum(LinkedList<Car> list){
        Double sum = 0.0;
        for(Car nextCar : list){
            sum = sum+nextCar.getWeight();
        }
        System.out.println("Сумма поля: " + sum);
    }
    private String returnThird(LinkedList<Car> list){
        System.out.println("Третяя машина: " + list.get(2).getName()+ ",  вес: "+list.get(2).getWeight());
        return list.get(2).getName();
    }
    private void returnTwo(LinkedList<Car> list){
        System.out.println("Два элемента начиная со второго: "+list.get(1).getName()+", "+ list.get(2).getName());
    }
    private void chooseTemplate(LinkedList<Car> list){
        System.out.println("По шаблону найдено: ");
        for(Car nextCar : list){
            if(nextCar.getName().equals("Opel")&nextCar.getWeight()>1.3){
                System.out.println("ID: "+nextCar.getId()+", марка: "+nextCar.getName()+", вес: " + nextCar.getWeight());
            }
        }
    }
    private void addToName(LinkedList<Car> list){
        System.out.println("Новые имена: ");
        for (Car nextCar : list) {
            nextCar.setName(nextCar.getName()+"_1");
        }
    }

    private void sortID(LinkedList<Car> list){
        System.out.println("Сортировка по ID: ");
        Collections.sort(list, Car.COMPARE_BY_ID);
    }
}
