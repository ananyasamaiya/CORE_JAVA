/*
why we make different constructor (overloading constructor)

answer different constructor are made to implement different scernarios 

*/


class Shape{
    int l;
    int w;
    int h;

    Shape(int l){
        this.l = l;
    }

    Shape(int l,int w){
        this.l = l;
        this.w = w;
    }

    Shape(int l,int w,int h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
}

class S1{
    public static void main(String[] args){
        Shape a = new Shape(5);
        //a.l = 5;

        Shape b = new Shape(7,2);
        // b.l = 7;
        // b.w = 2;

        Shape c = new Shape(11,7,4);
        // c.l = 1;
        // c.w = 1;
        // c.h = 1;

        
    }
}