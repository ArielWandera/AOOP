package Question3;


import java.util.ArrayList;
import java.util.List;

public class Dealerships{
    public String name;
    public String location;
    public List<Salesmen> salesmen;
    public Cars[] car;
    public Salesmen[] salesman;

    public Dealerships(String name, String location) {
        this.name = name;
        this.location = location;
        this.salesmen= new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }

    public void addSalesman(Salesmen salesman){
        this.salesmen.add(salesman);
    }
    public void removeSalesman(Salesmen salesman){
        this.salesmen.remove(salesman);
    }
    public  List<Salesmen> getSalesmen(){
        return this.salesmen;
    }

}

