interface Kind {
    void aaa();
}

interface Intelligent{
    void bbb();
    void ccc();
    void ddd();
}

interface Beautiful extends Kind, Intelligent{
    void eee();
    void fff();
}

class AcchaHuman implements Beautiful{
    public void aaa() { }
    public void bbb() { }
    public void ccc() { }
    public void ddd() { }
    public void eee() { }
    public void fff() { }
}