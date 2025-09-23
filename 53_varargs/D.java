class D{
    static void info(int a, int b){
        System.out.println(a);
        System.out.println(b);
    } 
    public static void main(String[] args){
        int[] arr = {12, 45};

        D.info(arr);
    }
}

// D.java:9: error: method info in class D cannot be applied to given types;
//         D.info(arr);
//          ^
//   required: int,int
//   found:    int[]
//   reason: actual and formal argument lists differ in length
// 1 error