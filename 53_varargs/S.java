class S {
    
    static void process(String... x) {
        System.out.println("Hello");
    } 

    static void process(String[] y) {
        System.out.println("Hi");
    } 
    
    public static void main(String[] args) {
        process("mohan", "sohan", "tohan");
    }    
}


// S.java:7: error: cannot declare both process(String[]) and process(String...) in S
//     static void process(String[] y) {
//                 ^
// 1 error