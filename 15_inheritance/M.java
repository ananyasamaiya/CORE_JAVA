class AA{
    void walk(){
        System.out.println("I can walk");
    }
}

class BB extends AA{
    void talk(){
        System.out.println("I can talk");
    }
}

class CC extends BB{
    void laugh(){
        System.out.println("I can laugh");
    }
}

class M extends CC{
    public static void main(String[] args){
        M a = new M();

        a.walk();
        a.talk();
        a.laugh();
        System.out.println(a.toString());
    }
}