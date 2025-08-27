//problem 
//as for each only access the variable not change it
import java.util.Scanner;

class J1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][][] x = new int[2][4][2];

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                for(int k=0;k<x[i][j].length;k++)
                    System.out.print(x[i][j][k] + " ");
                System.out.println();
            }
            System.out.println("~~~~~~~~~~~~~~");
        }

        System.out.println("~~~~~~~~~~~~~~~~~x~~~~~~~~~~~~~~~~~");

        for(int[][] i : x){
            for(int[] j : i){
                for(int k : j){
                    k = sc.nextInt();
                }
            }
        }
        sc.close();
        System.out.println("---------------------");
        
        for(int[][] i : x){
            for(int[] j : i){
                for(int k : j){
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println("^^^^^^^^^^^^^^");
        }

    }
}