package Items;
import java.util.*;

public class Items {
    public String name;
    public int id;
    private double price;
    private int inventory;
    private static List<Items> items =new ArrayList<>();


    public Items(String name,int id, double price, int inventory) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.inventory = inventory;
        items.add(this);
    }



    public String getName() {
        return name;
    }



    public double getPrice() {
        return price;
    }



    public int getInventory() {
        return inventory;
    }
    public void deductInventory(double amount){
       inventory -= amount;

    }
    public void addInventory(double amount){
        inventory += amount;
    }
    public String getStatus(){
        if(inventory>=20){
            return ("In stock");
        } else if (inventory>0) {
            return (inventory + " remaining");
        }else{
            return ("Out of stock");
        }
    }

    public  String toString(){
        return "ID:"+id + " Name:"+name + " Price:" +price + " Available items:" + getStatus();
    }

    public static void printItems(){
        if(items.isEmpty()){
            System.out.println("No available items");
        }else{
            System.out.println("=====ITEMS=====");
            for(Items item: items){
                System.out.println(item.toString());
            }
        }
    }

}
