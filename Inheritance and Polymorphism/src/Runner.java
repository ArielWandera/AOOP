public class Runner extends Athlete {
    public double fastestTime;
    public double quickestLap;
    public double averageTime;

    public Runner(String name, int yob, double weight, double height ,double fastestTime,double quickestLap) {
        super(name, yob, weight, height);
        this.fastestTime= fastestTime;
        this.quickestLap=quickestLap;

    }
    public void findAvgTime(){
        averageTime = fastestTime/4;
        System.out.println("Average time per lap is:"+averageTime);
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Fastest Time:"+fastestTime);
        System.out.println("Quickest Lap"+quickestLap);
    }
}
