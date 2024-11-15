package Q2;

class Type2 implements ObjectBehavior {
    private int attribute = 200;
    private String detail2 = "Cold blooded";

    @Override
    public void performAction() {
        System.out.println("Snake starts slithering");
    }

    @Override
    public void haltAction() {
        System.out.println("Snake stops slithering");
    }

    @Override
    public int getAttribute() {
        return attribute;
    }

    @Override
    public String getType() {
        return "Type 2";
    }

    public String getDetail2() {
        return detail2;
    }

}


