public class Trailer extends Vehicles{
    public String plate;
    public Trailer(double CIF, double seatingCapacity, double grossWeight, double engineCapacity, double year, String plate) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, year);
        this.plate=plate;
    }
    @Override
    public void payTax(Vehicles obj) {
        System.out.println("Trailer");
        super.payTax();
        double age= 2024-year;

        obj.getID();
        obj.getVAT();
        obj.getWHT();
        obj.getIL();
        obj.getSD();
        obj.getFF();
        obj.getED();
        obj.Registration(plate);
        if(grossWeight>15000 && grossWeight<20000){
            double a =CIF * 0.15;
            System.out.println("Weight tax: "+a);
            tax+=a;


        } else if (grossWeight>20000) {
            double a =CIF * 0.25;
            System.out.println("Weight tax: "+a);
            tax+=a;

        }else if(grossWeight<15000){
            double a = CIF *0.05;
            System.out.println("Weight tax: "+a);
            tax+=a;

        }if(engineCapacity>20000){
            double a = CIF *0.1;
            System.out.println("Engine capacity: "+a);
            tax+=a;
        }else if(engineCapacity>15000&&engineCapacity<20000) {
            double a = CIF * 0.05;
            System.out.println("Engine capacity: " + a);
            tax += a;
        }else if(engineCapacity<15000){
                double a = CIF *0.025;
                System.out.println("Engine capacity: "+a);
                tax+=a;
            }
        if(age<5){
            double a = CIF *0.015;
            System.out.println("Add ons for Infrastructure Levy: "+a);
            tax+=a;

        }else if(age>5&& age<10){
            double a = CIF *0.05;
            System.out.println("Add ons for Infrastructure Levy: "+a);
            tax+=a;

        }else if(age>10&& age<15){
            double a = CIF *0.1;
            System.out.println("Add ons for Infrastructure Levy: "+a);
            tax+=a;

        }

        System.out.println("Total:"+tax);
        System.out.println();



    }
}
