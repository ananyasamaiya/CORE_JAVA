class Q1{
       public static void main(String[] args){
        int[][] y = new int[4][3];

        System.out.println(y.length); 
        System.out.println("~~~~~~~~~~~~~~"); 
        System.out.println(y[0].length); 
        System.out.println(y[1].length); 
        System.out.println(y[2].length); 
        System.out.println(y[3].length); 
        System.out.println("~~~~~~~~~~~~~");
        System.out.println(y[0][0].length);
    }
}

// Q1.java:12: error: int cannot be dereferenced
//         System.out.println(y[0][0].length);
//                                   ^
// 1 error