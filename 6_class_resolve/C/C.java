// making 2 .java file 
// 1) C.java
// 2) ABC.java
// C.java also have a class ABC in same source file
// so the class ABC in the same source file will be access
class C{
    public static void main(String[] args)
    {
        ABC a = new ABC();
        System.out.println(a.y);  //33
    }
}


class ABC{
    int y = 33;
}