public class Sedan extends Vehicles{
    public Sedan(double CIF, double seatingCapacity, double grossWeight, double engineCapacity, double year) {
        super(CIF, seatingCapacity, grossWeight, engineCapacity, year);
    }

    @Override
    public void payTax(Vehicles obj) {
        System.out.println("Sedan");
        double age = 2024 - year;

        super.payTax();


            obj.getID();
            obj.getVAT();
            obj.getWHT();
            obj.getIL();
            obj.getSD();
            obj.getFF();
            obj.getED();
            obj.Registration("B");

            if (grossWeight > 1500 && grossWeight < 2000) {
                double a = CIF * 0.1;
                System.out.println("Weight tax: " + a);
                tax += a;


            } else if (grossWeight > 2000) {
                double a = CIF * 0.15;
                System.out.println("Weight tax: " + a);
                tax += a;

            } else if (grossWeight < 1500) {
                double a = CIF * 0.02;
                System.out.println("Weight tax: " + a);
                tax += a;

            }
            if (engineCapacity > 2000) {
                double a = CIF * 0.1;
                System.out.println("Engine capacity: " + a);
                tax += a;
            } else if (engineCapacity < 1500) {
                double a = CIF * 0.025;
                System.out.println("Engine capacity: " + a);
                tax += a;
            }


            if (age > 10 && age < 15) {
                double a = CIF * 0.01;
                System.out.println("Add ons for Infrastructure Levy: " + a);
                tax += a;

            } else if (age > 5 && age < 10) {
                double a = CIF * 0.05;
                System.out.println("Add ons for Infrastructure Levy: " + a);
                tax += a;

            } else if (age < 5) {
                double a = CIF * 0.015;
                System.out.println("Add ons for Infrastructure Levy: " + a);
                tax += a;

            }
        System.out.println("Total:"+tax);
        System.out.println();




    }
}
