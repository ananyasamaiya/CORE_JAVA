class YY1{
    YY1(int a){
        System.out.println("Hello");
    }
}

class V1 extends YY1{

    V1(){  //error coming in this line

    }

    public static void main(String[] args){
        System.out.println("A");
        V1 x = new V1();
        System.out.println("B");
    }
}
// V1.java:9: error: constructor YY1 in class YY1 cannot be applied to given types;
//     V1(){
//         ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error