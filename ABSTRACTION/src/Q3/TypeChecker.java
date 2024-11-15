package Q3;



public class TypeChecker {
    public void identifyObjectType(ParentClass obj){
        if (obj instanceof ChildClass1) {
            System.out.println("This is an object of Child class 1");
        } else if (obj instanceof ChildClass2 ) {
            System.out.println("This is an object of Child class 2");

        }
    }




}
