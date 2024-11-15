package Q2;

    class Type1 implements ObjectBehavior {
        private int attribute = 100;
        private String detail = "Warm blooded";

        @Override
        public void performAction() {
            System.out.println("Man starts running");
        }

        @Override
        public void haltAction() {
            System.out.println("Man stops running");
        }

        @Override
        public int getAttribute() {
            return attribute;
        }

        @Override
        public String getType() {
            return "Type 1";
        }

        public String getDetail1() {
            return detail;
        }

    }


