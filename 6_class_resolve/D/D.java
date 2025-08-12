// making 2 .java file 
// 1) D.java
// 2) ABC.java
//Here D.java DON'T have a class ABC in same source file
// so ABC.java will be compiled first and see if any ABC.class is generated if YES then compile D.java
class D{
    public static void main(String[] args)
    {
        ABC a = new ABC();
        System.out.println(a.y);  //999
    }
}


// class ABC{
//     int y = 33;
// }