public class Main {
    public static void main(String[] args) {
        Individuals a1 = new Individuals("Jeff",23,56000,"Hwidn4673");
        Companies s1 = new Companies("NBS",56,89000,"deehw34488","Fred");

        System.out.println("New balance: " + a1.newBalance(3800) );
        System.out.println("New balance: " + s1.newBalance(40000) );



    }
}
