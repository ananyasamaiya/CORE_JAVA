//interface method is implicity defined public and abstract

interface Y7{
    void pro();
}

//OK
// class P implements Y7{
//     public void pro(){

//     }
// }

// class P implements Y7{
//     //attempting to assign weaker access privileges; was public
//     void pro(){

//     }
// }

//  P is not abstract and does not override abstract method pro() in Y7
class P implements Y7{

}
