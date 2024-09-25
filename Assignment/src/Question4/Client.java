package Question4;

class Client {
    private String name;
    protected int accountbal;
    private final String password;

    public Client(String name, int accountbal, String password) {
        this.name = name;
        this.accountbal = accountbal;
        this.password = password;
    }
    private void getDetails(){
        System.out.println("Name:"+name);
        System.out.println("Password:"+password);
    }
    protected void getBalance(){
        System.out.println("Account: Sh."+accountbal);
    }
    protected void subscription(){
        int a=accountbal-10000;
        System.out.println("Balance:Sh."+a);

    }
     public void printInfo(){
        getDetails();
        getBalance();
        subscription();

     }
}
