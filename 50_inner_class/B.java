class B{
    int x = 99;

    void pro(){
        System.out.println("Hello...");
    }

    class A{

    }
    public static void main(String[] args){
        System.out.println(x);
    }
} 

// B.java:12: error: non-static variable x cannot be referenced from a static context
//         System.out.println(x);
//                            ^
// 1 error