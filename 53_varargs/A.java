class A{
    static void pro(){
        System.out.println("hello");
    }

    public static void main(String[] args){
        A.pro();

        A.pro(23);
    }
}

// A.java:9: error: method pro in class A cannot be applied to given types;
//         A.pro(23);
//          ^
//   required: no arguments
//   found:    int
//   reason: actual and formal argument lists differ in length
// 1 error