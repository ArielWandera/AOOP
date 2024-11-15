package Q3;

public class Main {
    public static void main(String[] args) {
        ParentClass p2 = new ParentClass("Fred",74);
        ChildClass1 c1 = new ChildClass1("Jeff",15,"High school");
        ChildClass2 a5 = new ChildClass2("Kevin",34,"ha986");

        p2.displayMessage();
        c1.showDetails();
        a5.showDetails();
        c1.displayMessage();



        TypeChecker check = new TypeChecker();
        check.identifyObjectType(c1);
        check.identifyObjectType(a5);

        BaseFinalClass f2 = new BaseFinalClass();
        f2.Statement();

    }
}
