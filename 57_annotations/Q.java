@interface KK{
    int x = 2;
    String y = "golu";
}

@KK(x=34,y="raju")
class Q{

}


// Q.java:6: error: cannot find symbol
// @KK(x=34,y="raju")
//     ^
//   symbol:   method x()
//   location: @interface KK
// Q.java:6: error: cannot find symbol
// @KK(x=34,y="raju")
//          ^
//   symbol:   method y()
//   location: @interface KK
// 2 errors