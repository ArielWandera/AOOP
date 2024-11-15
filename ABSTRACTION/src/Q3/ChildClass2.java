package Q3;

public class ChildClass2 extends ParentClass{
    public String id;

    public ChildClass2(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("ID: "+id);
    }
}
