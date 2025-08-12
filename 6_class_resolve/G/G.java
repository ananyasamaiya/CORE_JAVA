// Here we have 2 file 
// 1) G.java 
// 2)X.java
// it will not look into X.java to find ABC.class
class G{
    public static void main(String[] args)
    {
        ABC a = new ABC();
        System.out.println(a.y);  
    }
}
//ERROR

// class ABC{
//     int y = 33;
// }

// G.java:8: error: cannot find symbol
//         ABC a = new ABC();
//         ^
//   symbol:   class ABC
//   location: class G
// G.java:8: error: cannot find symbol
//         ABC a = new ABC();
//                     ^
//   symbol:   class ABC
//   location: class G
// 2 errors
