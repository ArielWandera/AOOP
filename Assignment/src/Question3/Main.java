package Question3;

public class Main {
    public static void main(String[] args){
        Cars c1 = new Cars("Volkswagen","GT3",14);
        Cars c2= new Cars("BMW","X3",9);
        Cars c3= new Cars("Mercedes","AMG",6);
        Cars c4= new Cars("Jeep","Wrangler",8);

        Dealerships d1= new Dealerships("SpearMotors","Nakawa");
        Dealerships d2= new Dealerships("Martin","Kawempe");

        Salesmen s1= new Salesmen("Rogers","001");
        Salesmen s2= new Salesmen("Jeff","003");
        Salesmen s3= new Salesmen("Greg","200");
        Salesmen s4= new Salesmen("Fred","859");


        d1.salesmen.add(s1);
        d1.salesmen.add(s2);
        d2.salesmen.add(s3);
        d2.salesmen.add(s4);

        s1.cars.add(c1);
        s1.cars.add(c3);
        s2.cars.add(c2);
        s3.cars.add(c3);
        s4.cars.add(c4);

        System.out.println("Dealership:"+ d1.name);
        for(Salesmen man: d1.getSalesmen()){
            System.out.println("Salesman:" +man.name);
        System.out.println("Salesman:"+d2.name);
            System.out.println("Salesman:"+s1.name);
        for(Cars car: s1.getCars()){

            System.out.println("Cars:"+car.brand + " "  +car.numberOfCars);
        }
        Cars c5 = new Cars("Hammer","x9",8);
            System.out.println("Car:"+c5.brand +" "+c5.model + " " +c5.numberOfCars);





    }
}
}
