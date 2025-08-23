/*
why we make different constructor (overloading constructor)

answer : different constructor are made to implement different scernarios 

*/


class Shape{
    int l;
    int w;
    int h;
}

class S{
    public static void main(String[] args){
        Shape a = new Shape();
        a.l = 5;

        Shape b = new Shape();
        b.l = 7;
        b.w = 2;

        Shape c = new Shape();
        c.l = 11;
        c.w = 7;
        c.h = 4;
    }
}