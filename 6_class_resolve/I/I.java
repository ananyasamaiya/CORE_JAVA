
//will not check the SUB or UPPER  folder

class I{
    public static void main(String[] args)
    {
        ABC a = new ABC();
        System.out.println(a.y);  
    }
}

// I.java:7: error: cannot find symbol
//         ABC a = new ABC();
//         ^
//   symbol:   class ABC
//   location: class I
// I.java:7: error: cannot find symbol
//         ABC a = new ABC();
//                     ^
//   symbol:   class ABC
//   location: class I
// 2 errors


// class ABC{
//     int y = 33;
// }