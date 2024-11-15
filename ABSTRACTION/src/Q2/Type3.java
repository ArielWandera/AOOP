package Q2;

class Type3 implements ObjectBehavior {
    private int attribute = 300;
    private String detail3 = "Full of fur";

    @Override
    public void performAction() {
        System.out.println("Mole starts digging");
    }

    @Override
    public void haltAction() {
        System.out.println("Mole stops digging");
    }

    @Override
    public int getAttribute() {
        return attribute;
    }

    @Override
    public String getType() {
        return "Type 3";
    }

    public String getDetail3() {
        return detail3;
    }


}
