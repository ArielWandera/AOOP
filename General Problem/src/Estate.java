public class Estate extends Vehicles{
    public String plate;

    public Estate(double CIF, double seatingCapacity, double grossWeight, double engineCapacity, double year, String plate ) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, year);
        this.plate = plate;


    }


    @Override
    public void payTax(Vehicles obj) {
        System.out.println("Estate");
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
        if(seatingCapacity>5){
            double a =((seatingCapacity-5)*250000);
            System.out.println("Seating tax: "+a);
            tax+=a;
        }
        if(grossWeight>1500 && grossWeight<2000){
            double a =CIF * 0.05;
            System.out.println("Weight tax: "+a);
            tax+=a;


        } else if (grossWeight>2000) {
            double a =CIF * 0.1;
            System.out.println("Weight tax: "+a);
            tax+=a;

        }else if(grossWeight<1500){
            double a = CIF *0.02;
            System.out.println("Weight tax: "+a);
            tax+=a;

        }if(engineCapacity>1800){
            double a = CIF *0.05;
            System.out.println("Engine capacity: "+a);
            tax+=a;
        }else if(engineCapacity<1800) {
            double a = CIF * 0.025;
            System.out.println("Engine capacity: " + a);
            tax += a;
        }
        if(age>1&& age<5){
            double a = CIF *0.01;
            System.out.println("Add ons for Infrastructure Levy: "+a);
            tax+=a;

        }else if(age>5&& age<10){
            double a = CIF *0.05;
            System.out.println("Add ons for Infrastructure Levy: "+a);
            tax+=a;

        }else if(age>10){
            double a = CIF *0.15;
            System.out.println("Add ons for Infrastructure Levy: "+a);
            tax+=a;

        }
        System.out.println("Total:"+tax);
        System.out.println();



    }
}
