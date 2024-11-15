public class Ambulance extends Vehicles {
    public Ambulance(double CIF, double seatingCapacity, double grossWeight, double engineCapacity, double year) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, year);


    }


    public void payTax(Vehicles obj) {
        System.out.println("Ambulance");
        double age = 2024-year;
        obj.getSD();
        obj.getFF();
        obj.getED();
        obj.Registration("A");
        if(age>10){
            double il = CIF *0.15;
            System.out.println("Infrastructure Levy:"+il);
            tax+=il;

        }else{
            obj.getIL();

        }
        System.out.println("Total:"+tax);
        System.out.println();


    }
}
