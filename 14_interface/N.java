//prove interface method is abstract

interface Y2{
    void pro();
}

class N implements Y2{

}


// N.java:7: error: N is not abstract and does not override abstract method pro() in Y2
// class N implements Y2{
// ^
// 1 error
