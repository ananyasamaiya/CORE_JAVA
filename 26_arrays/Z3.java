class Z3{
    public static void main(String[] args){
        int[][] x = {{12,23,45,56},{5,7,9},{3,34}};
        int[][] y = new int[x.length][];
        for(int i =0,j=x.length-1;i<x.length;i++,j--){
            y[i] = new int[x[j].length];
        }
        
        for(int i=0,k=y.length-1;i<y.length;i++,k--){
            for(int j=0,l=y[i].length-1;j<y[i].length;j++,l--){
                y[i][j] = x[k][l];
            }
        }

        for(int i=0;i<y.length;i++){
            for(int j=0;j<y[i].length;j++){
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}