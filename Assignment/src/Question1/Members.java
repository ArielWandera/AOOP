package Question1;


public class Members {
    public String name;
    public int weight;
    public static int i=1;
    public  int Id;
    public String ID;

    {
      Id=i++;
      ID= String.valueOf(Id);
        System.out.println("ID:" +ID);
    }

    public Members( String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }


}
