class Shape{
    int length;
    int width;
    int height;

    Shape(int length){
        this.length = length;
    }

    Shape(int length, int width){
        this.length = length;
        this.width = width;
    }

    Shape(int length, int width, int height){
        this(length,width);
        System.out.println(this.length + " ---- Shape(int, int, int)");
        System.out.println(this.width + " ---- Shape(int, int, int)");
        System.out.println(this.height + " ---- Shape(int, int, int)");

        // this.length = length;
        // this.width = width;
        this.height = height;
    }
}

class K{
    public static void main(String[] args){
        Shape x = new Shape(12, 14, 16);

        System.out.println(x.length);
        System.out.println(x.width);
        System.out.println(x.height);
    }
}