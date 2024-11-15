public class SUV extends Vehicles{
    public SUV(double CIF, double seatingCapacity, double grossWeight, double engineCapacity, double year) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, year);
    }

    @Override
    public void payTax(Vehicles obj) {
        System.out.println("SUV");
        super.payTax();
        double age= 2024-year;
        obj.getID();
        obj.getVAT();
        obj.getWHT();
        obj.getIL();
        obj.getSD();
        obj.getFF();
        obj.getED();
        obj.Registration("A");
        if(seatingCapacity>5){
            double a =((seatingCapacity-5)*350000);
            System.out.println("Seating tax: "+a);
            tax+=a;
        }



         if (grossWeight>5000) {
            double a =CIF * 0.15;
            System.out.println("Weight tax: "+a);
            tax+=a;

        }

        if(age>1&& age<5){
            double a = CIF *0.01;
            System.out.println("Add ons for Infrastructure Levy: "+a);
            tax+=a;

        }else if(age>5&& age<10){
            double a = CIF *0.15;
            System.out.println("Add ons for Infrastructure Levy: "+a);
            tax+=a;

        }else if(age>10){
            double a = CIF *0.25;
            System.out.println("Add ons for Infrastructure Levy: "+a);
            tax+=a;

        }
        System.out.println("Total:"+tax);
        System.out.println();



    }
}
