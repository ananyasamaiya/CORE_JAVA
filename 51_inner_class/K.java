interface W5 {
    void eee();
}

interface W6 {
    void fff();
}



class K {
    W5 a = new W5() {
        public void eee() {

        }
    };

    W6 b = new W6() {
        public void fff() {
            
        }
    };
}