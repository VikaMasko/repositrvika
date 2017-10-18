package lesson2;

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
}
