public abstract class Vehicles extends TR{
    public double seatingCapacity;
    public double grossWeight;
    public double engineCapacity;
    public double year;

    public Vehicles(double CIF, double seatingCapacity, double grossWeight, double engineCapacity, double year) {
        super(CIF,year);
        this.seatingCapacity = seatingCapacity;
        this.grossWeight = grossWeight;
        this.engineCapacity = engineCapacity;

    }
    public void bond(double days){
        double a=days * 15000;
        tax+=a;
    }
    public void transportation(double x){
        if(x==1){
            double a=CIF *0.005;
            tax+=a;
        }else if(x==2){
            double a=CIF *0.015;
            tax+=a;
        }
    }


    public abstract void payTax(Vehicles obj);
}
