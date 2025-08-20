//variable and method would be inherited
//constructor does not get inherited

class A{
    static void pro(){

    }

    public static void main(String[] args){
        pro();

        info();
    }
}

// A.java:9: error: cannot find symbol
//         info();
//         ^
//   symbol:   method info()
//   location: class A
// 1 error