//boolean can't be convertible to any other type

class D2{
    public static void main(String[] args){
        boolean h = false;

        int[] x = {(int) h};
    }
}

// D2.java:7: error: incompatible types: boolean cannot be converted to int
//         int[] x = {(int) h};
//                          ^
// 1 error