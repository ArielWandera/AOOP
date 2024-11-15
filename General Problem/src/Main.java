public class Main {

    public static void main(String[] args) {
     Ambulance a1 = new Ambulance(40000,7,30000,3455,2022);
     a1.payTax(a1);


     Sedan s1= new Sedan(850000,8,1800,2500,2018);
     s1.payTax(s1);


     Other o4 = new Other(90000,6,800,4600,2019,"B");
     o4.bond(4);
     o4.payTax(o4);

     SUV h3 = new SUV(900000,9,4000,1600,2020);
     h3.bond(5);
     h3.transportation(1);
     h3.payTax(h3);

     Trailer r4 = new Trailer(67000,13,90000,20000,2021,"B");
     r4.bond(3);
     r4.transportation(2);
     r4.payTax(r4);

     Estate e7= new Estate(89000,12,80000,3400,2017,"A");
     e7.bond(9);
     e7.transportation(1);
     e7.payTax(e7);




    }
}