public static void main(String[] args) {
    CPlayer c1 = new CPlayer("Dave", 2002, 83, 5.8, 90000, "Foward");
    c1.getDetails();
    S_player s1 = new S_player("Cole Palmer", 2001, 78, 6.1, 120000, "CAM");
    s1.getDetails();
    Runner r1 = new Runner("Cheptegei", 1998, 58, 5.9, 20, 4.8);
    r1.getDetails();
    r1.findAvgTime();
}