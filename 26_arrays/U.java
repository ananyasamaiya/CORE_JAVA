/*
can't store 2 - D array in 1-D array variable visa vasa

*/
class U{
    public static void main(String[] args){
        int[][] a = new int[2];
        int[] b = new int[3][4];
        //------------
        int[][] c = {12,34,56};
        int[] d = {{12}};
        //-----------
        int[] x = {new int[2], new int[3]};
    }


}
// U.java:7: error: incompatible types: int[] cannot be converted to int[][]
//         int[][] a = new int[2];
//                     ^
// 1 error