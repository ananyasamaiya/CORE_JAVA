class YY{
    YY(int a){
        System.out.println("Hello");
    }
}

class V extends YY{  //error coming in this line
    public static void main(String[] args){
        System.out.println("A");
        V x = new V();
        System.out.println("B");
    }
}

// V.java:7: error: constructor YY in class YY cannot be applied to given types;
// class V extends YY{
// ^
//   required: int
//   found:    no arguments
//   reason: actual and formal argument lists differ in length
// 1 error
