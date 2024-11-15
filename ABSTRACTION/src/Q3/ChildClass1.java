package Q3;

public class ChildClass1 extends ParentClass{
    public String educationalLevel;

    public ChildClass1(String name, int age, String educationalLevel) {
        super(name, age);
        this.educationalLevel = educationalLevel;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Educational level: "+educationalLevel);
    }
}
