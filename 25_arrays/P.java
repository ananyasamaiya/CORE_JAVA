//print ref code of 2-D array
class P{
    public static void main(String[] args){
        int[][] y = new int[4][3];

        System.out.println(y); //ref code of y(2-D ref variable)
        System.out.println("~~~~~~~~~~~~~~"); 
        System.out.println(y[0]); //ref code of y[](1-D ref variable)
        System.out.println(y[1]); //ref code of y[](1-D ref variable)
        System.out.println(y[2]); //ref code of y[](1-D ref variable)
        System.out.println(y[3]); //ref code of y[](1-D ref variable)
        System.out.println("~~~~~~~~~~~~~");
        System.out.println(y[0][0]); //int variable
        System.out.println(y[0][1]); //int variable
        System.out.println(y[0][2]); //int variable
        System.out.println(y[1][0]); //int variable
        
    }
}