class A2 {
    private A2() {

    }
}

class F {
    public static void main(String[] args) {
        A2 x = new A2();
    }
}


// F.java:9: error: A2() has private access in A2
//         A2 x = new A2();
//                ^
// 1 error