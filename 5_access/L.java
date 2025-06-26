// IS-A

class Student1 extends Pen1 {
    public static void main(String[] args)
    {
        Student1 x = new Student1();

        x.write();
    }
}
class Pen1{
    void write()
    {
        System.out.println("writing some thing");
    }
}

    //  Pen1
    //   ^
    //   |
    //   | IS-A
    //   | 
    // Student11

