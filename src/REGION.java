public enum REGION {
    OSH(" OSH:  СУЛАЙМАН-ТОО"){
        @Override
        public void metodq() {

        }
    },
    DJALALABAD("ДЖАЛАЛ-АБАД"){
        @Override
        public void metodq() {

        }},

    NARYN("ЭТ"){
        @Override
        public void metodq() {

        }
    },

    YSYKKUL("ЫССЫК-КОЛ"){
        @Override
        public void metodq() {

        }
    },
   CHYI ("АШЛЯНФУ"){
        @Override
        public void metodq() {

        }},
    BATKEN("АЙГУЛ ГУЛУ"){
        @Override
        public void metodq() {

        }

    },
    TALAS("ТАШ РАБАТ"){
        @Override
        public void metodq() {

        }
    };
private String name;


    REGION(String name) {
        this.name = name;

    } public abstract void metodq();

    @Override
    public String toString() {
        return "REGION{" +
                "name='" + name + '\'' +
                '}';
    }
}
