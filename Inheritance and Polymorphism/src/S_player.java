public class S_player extends CPlayer {
    protected double newSalary;

    public S_player(String name, int yob, double weight, double height, int salary, String position) {
        super(name, yob, weight, height, salary, position);
    }

    public void getDetails(){
        System.out.println("Name:" + name);
        System.out.println("Age:"+((2024-yob)+1));
        System.out.println("Weight:" +weight);
        System.out.println("BMI:" + BMI);
        double bonus = (0.2 * salary);
        newSalary=salary + bonus;
        System.out.println("Salary:" +newSalary);
        System.out.println("Position:"+position);
    }

}
