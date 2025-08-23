//can't can constructor of abstract classand enum
class AA{
    AA(){
        System.out.println("HIIIIII");
    }
} 

abstract class BB{
    BB(){
        System.out.println("Hello");
    }
}

interface CC{
    //NA
    // CC(){
        
    // }
}

enum DD{
    x,y,z;

    DD(){

    }
}

class G{
    public static void main(String[] args){
        new AA();

        new BB();

        new DD();
    }
}

// G.java:33: error: BB is abstract; cannot be instantiated
//         new BB();
//         ^
// G.java:35: error: enum types may not be instantiated
//         new DD();
//         ^
// 2 errors