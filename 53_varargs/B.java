class B {
    static void add(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }
 
    public static void main(String[] args) {
        // add(12, 45);

        // add(23);

        add(10, 20, 30);
    }    
}


// B.java:10: error: method add in class B cannot be applied to given types;
//         add(23);
//         ^
//   required: int,int
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error



// B.java:12: error: method add in class B cannot be applied to given types;
//         add(10, 20, 30);
//         ^
//   required: int,int
//   found:    int,int,int
//   reason: actual and formal argument lists differ in length
// 1 error