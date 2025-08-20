//prove variable inside interface is static
interface Y1{
    int a = 45;
}

class L{
    public static void main(String[] args){
        System.out.println(Y1.a); 
        //interface variable a is implicitly static
    }
}


// .java:10: error: cannot assign a value to final variable w
//         Y2.w = 234;
//           ^
// 1 error