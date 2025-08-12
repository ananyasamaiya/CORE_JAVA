// Here we have 3 file 
// 1) E.java 
// 2)ABC.java have y=2300
// 3)ABC.class which have y=999 in it
// now when we compile E.java 
// ABC.java will be compiled and y=2300 will be printed
// even if ABC.class exist
// if you compile E.java ABC.class(y=999) will be override to (y=2300)

class E{
    public static void main(String[] args)
    {
        ABC a = new ABC();
        System.out.println(a.y);  //2300
    }
}


// class ABC{
//     int y = 33;
// }