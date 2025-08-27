class G{
    public static void main(String[] args){
        int[][][] x = new int[2][4][2];

        x[0][0][0] = 11;
        x[0][0][1] = 12;

        x[0][1][0] = 13;
        x[0][1][1] = 14;
        
        x[0][2][0] = 15;
        x[0][2][1] = 16;
        
        x[0][3][0] = 17;
        x[0][3][1] = 18;
        //------------
        
        x[1][0][0] = 21;
        x[1][0][1] = 22;
        
        x[1][1][0] = 23;
        x[1][1][1] = 24;
        
        x[1][2][0] = 25;
        x[1][2][1] = 26;
        
        x[1][3][0] = 27;
        x[1][3][1] = 28;

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                for(int k=0;k<x[i][j].length;k++)
                    System.out.print(x[i][j][k] + " ");
                System.out.println();
            }
            System.out.println("~~~~~~~~~~~~~~");
        }

    }
}