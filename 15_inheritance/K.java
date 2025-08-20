// cyclic inheritance

class T1 extends K{

}

class K extends T1{


}

// K.java:3: error: cyclic inheritance involving T1
// class T1 extends K{
// ^
// 1 error