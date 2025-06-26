// Student ----> HAS-A ----> Pen
class Student {
    public static void main(String[] args){
        Pen x = new Pen();

        x.write();
    }
}
class Pen{
    void write()
    {
        System.out.println("writing");
    }
}

