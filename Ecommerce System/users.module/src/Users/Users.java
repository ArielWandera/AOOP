package Users;

import Items.Items;
import java.util.ArrayList;
import java.util.List;

public class Users {
    public String name;
    private String email;
    private String password;
    private double balance;
    private int creditPoints=0;
    private List<Items> boughtItems = new ArrayList<>();

    public Users(String name, double balance, String email, String password) {
        this.name = name;
        this.balance = balance;
        this.email = email;
        this.password= password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public int getCredit() {
        return creditPoints;
    }
    public void deductCredit(double amount){
        creditPoints -= amount/1000;
    }
    public void addCredit(double amount){
        creditPoints += amount/1000;

    }

    public void deductBalance(double amount){
        balance -= amount;

    }
    public void addBalance(double amount){
        balance += amount;

    }

    public void addItem(Items item){
        boughtItems.add(item);
    }
    public void removeItem(Items item){
        boughtItems.remove(item);
    }
    public boolean hasItem(Items item){
        return boughtItems.contains(item);
    }

    public void printDetails(){
        System.out.println("Name:"+name+"email: "+email+"Balance:" +balance+"Credit Points:"+creditPoints);
    }
}
