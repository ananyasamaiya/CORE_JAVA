
//will not check the SUB or UPPER  folder

class H{
    public static void main(String[] args)
    {
        ABC a = new ABC();
        System.out.println(a.y);  
    }
}


// H.java:7: error: cannot find symbol
//         ABC a = new ABC();
//         ^
//   symbol:   class ABC
//   location: class H
// H.java:7: error: cannot find symbol
//         ABC a = new ABC();
//                     ^
//   symbol:   class ABC
//   location: class H
// 2 errors


// class ABC{
//     int y = 33;
// }