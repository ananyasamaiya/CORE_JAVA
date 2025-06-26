<<<<<<< HEAD
// not making defineCircle static

class Circle{
    int radius;
    float pi = 3.14f;

    void defineCircle()
    {
        System.out.println("a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).");
    }

    public static void main(String[] args){

        Circle x = new Circle();
        x.radius = 45;

        Circle y = new Circle();
        y.radius = 78;

        x.defineCircle();
        y.defineCircle();


    }
=======
// not making defineCircle static

class Circle{
    int radius;
    float pi = 3.14f;

    void defineCircle()
    {
        System.out.println("a round plane figure whose boundary (the circumference) consists of points equidistant from a fixed point (the centre).");
    }

    public static void main(String[] args){

        Circle x = new Circle();
        x.radius = 45;

        Circle y = new Circle();
        y.radius = 78;

        x.defineCircle();
        y.defineCircle();


    }
>>>>>>> 0577215d02043d72dfc9f3b7d836e8da7fb466d6
}