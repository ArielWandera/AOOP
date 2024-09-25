package Question4;

public class Organization extends Client {
    private String rep;


    public Organization(String name, int accountbal, String password, String rep) {
        super(name, accountbal, password);
        this.rep = rep;
    }

    private void getRep(){
        System.out.println("Representative:"+rep);
    }
    @Override
    public void printInfo(){
        super.printInfo();
        getRep();
    }
}
