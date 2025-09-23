class C {
    static void aaa(int x) {
        System.out.println(x);
    } 

    public static void main(String[] args) {
        aaa();
    }    
}

// C.java:7: error: method aaa in class C cannot be applied to given types;
//         aaa();
//         ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error