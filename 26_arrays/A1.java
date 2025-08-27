import java.util.Scanner;
class A1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[][] x =  new String[3][2];

        System.out.println("Enter value:");
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                x[i][j] = in.nextLine();
            }
            
        }

        System.out.println("~~~~~~~~~~");
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}