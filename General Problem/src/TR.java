

public class TR {
    public double tax = 0;
    public double CIF;
    public double year;

    public TR(double CIF, double year) {
        this.CIF = CIF;
        this.year=year;
    }



    public void payTax(){
        System.out.println("TAXES ARE:");
    }

    public void getID(){
        double id= CIF * 0.25 ;
        System.out.println("Import Duty: "+id);
        tax+=id;

    }
    public void getVAT(){
        double vat = CIF * 0.18 ;
        System.out.println("Value Added Tax: "+vat);
        tax+=vat;
    }
    public void getWHT(){
        double wht = CIF *0.06;
        System.out.println("Withholding tax: " +wht);
        tax+=wht;
    }
    public void getIL(){
        System.out.println("Infrastructure Levy: 150000");
        double il = 150000;
        tax+=il;
    }
    public void getSD(){
        System.out.println("Stamp Duty: 35000");
        double il = 35000;
        tax+=il;
    }
        public void getFF(){
            System.out.println("Form fees: 20000");
            double il = 20000;
            tax+=il;
        }
        public void getED(){
            System.out.println("Excise Duty: 200000");
            double il = 200000;
            tax+=il;
        }
        public void Registration(String type){
            if (type == "A") {
                double a=300000;
                System.out.println("Registration: 300000");
                tax+=a;
            } else if (type== "B"){
                double a=700000;
                System.out.println("Registration: 700000");
                tax+=a;

            }
            if (type == null) {
            }

        }

}
