package Question3;

import java.util.ArrayList;
import java.util.List;

public class Salesmen {
    public String name;
    public String ID;
    public List<Cars> cars;


    public Salesmen(String name, String ID) {
        this.name = name;
        this.ID = ID;
        this.cars= new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void addCar(Cars cars){
        this.cars.add(cars);
    }
    public void removeCar(Cars cars){
        this.cars.remove(cars);
    }

    public List<Cars> getCars() {
        return cars;
    }
}
