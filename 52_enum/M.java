enum CoffeeMugSize {
    SMALL, MEDIUM, LARGE
}

class M {
    public static void main(String[] args) {
        CoffeeMugSize x = new CoffeeMugSize();
    }    
}


// M.java:7: error: enum types may not be instantiated
//         CoffeeMugSize x = new CoffeeMugSize();
//                           ^
// 1 error