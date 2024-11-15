public class CPlayer extends Athlete {
    public int salary;
    public String position;

    public CPlayer(String name, int yob, double weight, double height, int salary,String position) {
        super(name, yob, weight, height);
        this.salary= salary;
        this.position= position;
    }

    public void getDetails(){
        System.out.println("Name:" + name);
        System.out.println("Age:"+((2024-yob)+1));
        System.out.println("Weight:" +weight);
        System.out.println("BMI:" + BMI);
        System.out.println("Salary:" +salary);
        System.out.println("Position:"+position);
    }

}
