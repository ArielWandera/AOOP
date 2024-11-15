public class Athlete {
    protected String name;
    protected int yob;
    protected double weight;
    protected double height;
    protected double BMI;


    public Athlete(String name, int yob ,double weight, double height) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.height = height;

    }

    public void getDetails(){
        BMI =  weight/(height*height);
        System.out.println("Name:" + name);
        System.out.println("Age:"+((2024-yob)+1));
        System.out.println("Weight:" +weight);
        System.out.println("BMI:" + BMI);
    }
}
