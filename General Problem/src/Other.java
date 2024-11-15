public class Other extends Vehicles{
    public String plate;
    public Other(double CIF, double seatingCapacity, double grossWeight, double engineCapacity, double year,String plate) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, year);
        this.plate=plate;
    }

    @Override
    public void payTax(Vehicles obj) {
        System.out.println("Other vehicle");
        super.payTax();
        obj.getID();
        obj.getVAT();
        obj.getWHT();
        obj.getIL();
        obj.getSD();
        obj.getFF();
        obj.getED();
        obj.Registration(plate);
        System.out.println("Total:"+tax);
        System.out.println();



    }
}
