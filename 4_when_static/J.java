<<<<<<< HEAD
// making defineCircle2 static and calcArea

class Circle2{
    int radius;
    float pi = 3.14f;

    static void defineCircle()
    {
        System.out.println("a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).");
    }
    void calcArea(){
        System.out.println(pi* radius* radius);
    }

    public static void main(String[] args){

        defineCircle();

        Circle2 x = new Circle2();
        x.radius = 45;

        Circle2 y = new Circle2();
        y.radius = 78;

        x.defineCircle();
        y.defineCircle();
        x.calcArea();
        y.calcArea();


    }
=======
// making defineCircle2 static and calcArea

class Circle2{
    int radius;
    float pi = 3.14f;

    static void defineCircle()
    {
        System.out.println("a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).");
    }
    void calcArea(){
        System.out.println(pi* radius* radius);
    }

    public static void main(String[] args){

        defineCircle();

        Circle2 x = new Circle2();
        x.radius = 45;

        Circle2 y = new Circle2();
        y.radius = 78;

        x.defineCircle();
        y.defineCircle();
        x.calcArea();
        y.calcArea();


    }
>>>>>>> 0577215d02043d72dfc9f3b7d836e8da7fb466d6
}