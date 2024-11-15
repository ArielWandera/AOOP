package Q3;

public class ParentClass {
    public String name;
    public int age;

    public ParentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails(){
        System.out.println("Name:"+ name);
        System.out.println("Age:"+ age);

    }
    public final void displayMessage(){
        System.out.println("This method cannot be overridden by subclasses");
    }
}
