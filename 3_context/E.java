//can't make local variable static

class E{
    void pro()
    {
        int y;
        static int w;
    }
}


// E.java:5: error: illegal start of expression
//         static int w;
//         ^
// E.java:7: error: class, interface, enum, or record expected
// }
// ^
// 2 errors