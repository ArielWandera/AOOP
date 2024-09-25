package Question2;

import static Question2.Participants.getHeading;

public class Main {
    public static void main(String[] args){
        Participants p1= new Participants("Steve","B6");
        Participants p2= new Participants("Jeff","c4");
        Participants p3= new Participants("Abdu","D1");
        System.out.println("Name:" + p1.getName());
        System.out.println("Residence:" + p1.getResidence());
        System.out.println("\n");
        System.out.println("Name:" + p2.getName());
        System.out.println("Residence:" + p2.getResidence());
        System.out.println("\n");
        System.out.println("Name:" + p3.getName());
        System.out.println("Residence:" + p3.getResidence());
        System.out.println("\n");

        System.out.println(getHeading());



    }
}
