package Question2;

public class Participants {
    public static String Heading= "2024 Condominium Committee";
    public String name;
    public String residence;

    static {
        System.out.println(Heading);
    }

    public Participants(String name,String residence){
        this.name=name;
        this.residence=residence;

    }

    public String getName() {
        return name;
    }

    public String getResidence() {
        return residence;
    }

    public static String getHeading() {
        return Heading;
    }
}
