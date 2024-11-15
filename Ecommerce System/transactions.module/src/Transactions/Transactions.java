package Transactions;

import Items.Items;
import Users.Users;

public class Transactions {
    public static void buyItems(Users user, Items item, double units){

        double cost = units * item.getPrice();
        if (user.getBalance()>=cost&& item.getInventory()>=units) {
            item.deductInventory(units);
            user.deductBalance(cost);
            user.addItem(item);
            user.addCredit(cost);
            System.out.println();
            System.out.println("=======Transaction Successful=========");
            System.out.println(units+" "+item.getName()+"(s) bought");
            Items.printItems();
        }else if(user.getBalance()>=cost&& item.getInventory()<units){
            System.out.println();
            System.out.println("=======Transaction Failed=========");
            System.out.println("Not enough items");
        }else{
            System.out.println();
            System.out.println("=======Transaction Failed=========");
            System.out.println("Insufficient balance");

        }
    }

    public static void getRefund(Users user , Items item, double units){
        double cost = units * item.getPrice();
        if(user.hasItem(item)){
        user.addBalance(cost);
        item.addInventory(units);
        user.removeItem(item);
        user.deductCredit(cost);
            System.out.println();
            System.out.println("=======Transaction Successful=========");
            System.out.println("Refund complete");
            Items.printItems();
        }else{
            System.out.println();
            System.out.println("=======Transaction Failed=========");
            System.out.println("No record of item bought");
        }


    }
}