//cant make object of interface

interface DD{

}

class C1{
    public static void main(String[] args){
        DD x = new DD();
    }
}

// C1.java:9: error: DD is abstract; cannot be instantiated
//         DD x = new DD();
//                ^
// 1 error



