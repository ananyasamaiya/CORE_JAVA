/*
write that code in initialized block which is common in all parametized constructor so it reduce repeation

*/

class F2{
    {
        System.out.println("XYZ");
    }
    F2(){
        ///System.out.println("XYZ");
        System.out.println("AAA");
    }

    F2(int y){
        //System.out.println("XYZ");
        System.out.println("BBB");
    }

    F2(int y,float h){
       // System.out.println("XYZ");
        System.out.println("CCC");
    }

    public static void main(String[] args){
        F2 a = new F2();
        F2 b = new F2(12);
        F2 c = new F2(12,3.4f);
    }
}