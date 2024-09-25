package Question1;



public class Main {



    public static void main(String[] args) {
        Members m1= new Members("Eddie",65);
        System.out.println("Member:" + m1.getName());
        System.out.println("Weight:" + m1.getWeight());
        Members m2= new Members("Steve",70);
        System.out.println("Member:" + m2.getName());
        System.out.println("Weight:" + m2.getWeight());

    }
}