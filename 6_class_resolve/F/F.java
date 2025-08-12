// Here we have 2 file 
// 1) F.java 
// 2)ABC.class have y=2300
// now when we compile E.java 
//NO ABC.java exist so it will look for ABC.java which we have
// so output 2300
class F{
    public static void main(String[] args)
    {
        ABC a = new ABC();
        System.out.println(a.y);  //2300
    }
}


// class ABC{
//     int y = 33;
// }