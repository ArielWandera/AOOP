package Question4.Test;

import Question4.Business;
import Question4.Organization;

public class Main {
    public static void main(String[] args){
        Organization o1 = new Organization("OMO",30000,"dgdye8394","Greg");
        Organization o2 = new Organization("JIK",20000,"sjiens","Steve Rojers");

        o1.printInfo();


        Business b1 = new Business();
        b1.clientDetails(o2);




    }
}
