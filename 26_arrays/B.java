//short cut
class B{
    public static void main(String[] args){
        String[][] x = new String[][]{{"om","ram","ganesh"},{"dholu","bholu"}};
        System.out.println("~~~~~~~~~~~~~");

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x[i].length;j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    
    
    }
}