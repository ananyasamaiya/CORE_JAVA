class YY2{
    YY2(int a){
        System.out.println("Hello");
    }
}

class V2 extends YY2{

    V2(){ 
        super(); //error coming in this line

    }

    public static void main(String[] args){
        System.out.println("A");
        V2 x = new V2();
        System.out.println("B");
    }
}

// V2.java:10: error: constructor YY2 in class YY2 cannot be applied to given types;
//         super(); //error coming in this line
//         ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error