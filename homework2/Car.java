package homework2;

import java.util.Comparator;

public class Car {
    private Integer id;
    private String name;
    private Double weight;

    public Car(int id, String name, Double weight){
        this.id = id;
        this.name  = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Double getWeight(){
        return weight;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car: "+ name + ", id: " +id +", weight: "+weight;
    }
    public static final Comparator<Car> COMPARE_BY_ID = new Comparator<Car>() {
        @Override
        public int compare(Car o1, Car o2) {
            return o1.getId() - o2.getId();
        }
    };
}
