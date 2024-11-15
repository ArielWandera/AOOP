package Q2;

public class Main {
    public static void main(String[] args) {
        ObjectBehavior[] objects = { new Type1(), new Type2(), new Type3() };

        for (ObjectBehavior obj : objects) {
            obj.performAction();
            System.out.println("Attribute: " + obj.getAttribute());
            System.out.println("Type: " + obj.getType());

            if (obj instanceof Type1) {
                System.out.println(((Type1) obj).getDetail1());
            } else if (obj instanceof Type2) {
                System.out.println(((Type2) obj).getDetail2());
            } else if (obj instanceof Type3) {
                System.out.println(((Type3) obj).getDetail3());
            }
            obj.haltAction();
            System.out.println();}


    }
}
