/*

for default constructor it will write super() as a first line statement


when we define constructor we can write (as a first line statement) this() , super() both with or without parameter

if we do not write any compiler on our behalf we write super()

*/
class AAA{
    AAA(){
        //compiler provided super no argument call
        //super();
        System.out.println("Namaste JI");
    }
}

class K extends AAA{
    //compiler suppiled constructor (default constructor)
    // K(){
    //     super();
    // }
    public static void main(String[] args){
        System.out.println("~~~~~main start~~~~");
        K t = new K();
        System.out.println("~~~~~main end~~~~");
    }
}