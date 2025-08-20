//prove interface method is public

interface Y4{
    void pro();
}

class N implements Y4{
    void pro(){

    }
}

// 2.java:8: error: pro() in N cannot implement pro() in Y4
//     void pro(){
//          ^
//   attempting to assign weaker access privileges; was public
// 1 error
